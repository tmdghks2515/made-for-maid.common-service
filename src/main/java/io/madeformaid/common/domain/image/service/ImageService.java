package io.madeformaid.common.domain.image.service;

import event.ImageEvent;
import event.ImageEvent.ImageUsingEvent;
import io.madeformaid.common.domain.commonCode.vo.enums.ImageStatus;
import io.madeformaid.common.domain.image.dto.command.UploadImageCommand;
import io.madeformaid.common.domain.image.dto.data.ImageDTO;
import io.madeformaid.common.domain.image.entity.ImageEntity;
import io.madeformaid.common.domain.image.mapper.ImageMapper;
import io.madeformaid.common.domain.image.repository.ImageRepository;
import io.madeformaid.common.global.util.s3.S3Uploader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;
    private final S3Uploader s3Uploader;

    public ImageDTO upload(UploadImageCommand command) {
        try {
            String uploadedFileName = s3Uploader.upload(command.getFile(), command.getImageType());

            ImageEntity uploadedImage = ImageEntity.of()
                    .imageType(command.getImageType())
                    .imageStatus(ImageStatus.UPLOADED)
                    .fileName(uploadedFileName)
                    .path(command.getImageType().getBasePath())
                    .build();

            ImageEntity savedImage = imageRepository.save(uploadedImage);

            return ImageMapper.toDTO(savedImage);
        } catch (Exception e) {
            throw new IllegalArgumentException("이미지 업로드에 실패했습니다.", e);
        }
    }

    public void using(ImageUsingEvent event) {
        ImageEntity image = imageRepository.findById(event.getImageId())
                .orElseThrow(() -> new IllegalArgumentException("Image not found"));
        image.using();
        imageRepository.save(image);
    }

    @Transactional(noRollbackFor =  Exception.class)
    public void unusing(ImageEvent.ImageUnusingEvent event) {
        ImageEntity image = imageRepository.findById(event.getImageId())
                .orElseThrow(() -> new IllegalArgumentException("Image not found"));
        image.unused();

        s3Uploader.delete(image.getPath() + image.getFileName());

        imageRepository.delete(image);
    }
}

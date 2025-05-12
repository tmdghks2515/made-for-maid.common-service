package io.madeformaid.common.domain.image.service;

import event.ImageEvent;
import event.ImageEvent.ImageUsingEvent;
import io.madeformaid.common.domain.commonCode.vo.enums.ImageStatus;
import io.madeformaid.common.domain.image.dto.command.UploadImageCommand;
import io.madeformaid.common.domain.image.dto.data.ImageDTO;
import io.madeformaid.common.domain.image.entity.ImageEntity;
import io.madeformaid.common.domain.image.mapper.ImageMapper;
import io.madeformaid.common.domain.image.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageDTO upload(UploadImageCommand command) {
        ImageEntity uploadedImage = ImageEntity.of()
                .imageType(command.getImageType())
                .imageStatus(ImageStatus.UPLOADED)
                .fileName(command.getFile().getOriginalFilename())
                .path(command.getFile().getOriginalFilename())
                .build();

        ImageEntity savedImage = imageRepository.save(uploadedImage);

        return ImageMapper.toDTO(savedImage);
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

        // aws s3 에서 삭제하는 로직 추가 필요

        imageRepository.delete(image);
    }
}

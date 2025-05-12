package io.madeformaid.common.domain.image.service;

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
}

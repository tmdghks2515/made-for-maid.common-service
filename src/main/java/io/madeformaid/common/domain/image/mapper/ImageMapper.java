package io.madeformaid.common.domain.image.mapper;

import io.madeformaid.common.domain.image.dto.data.ImageDTO;
import io.madeformaid.common.domain.image.entity.ImageEntity;

public class ImageMapper {
    public static ImageDTO toDTO(ImageEntity imageEntity) {
        return ImageDTO.of()
                .id(imageEntity.getId())
                .imageType(imageEntity.getImageType())
                .fileName(imageEntity.getFileName())
                .path(imageEntity.getPath())
                .build();
    }
}

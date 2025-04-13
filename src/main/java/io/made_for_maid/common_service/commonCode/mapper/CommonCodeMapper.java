package io.made_for_maid.common_service.commonCode.mapper;

import io.made_for_maid.common_service.commonCode.dto.data.CommonCodeDTO;
import io.made_for_maid.common_service.commonCode.entity.CommonCodeEntity;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommonCodeMapper {
    // CommonCodeEntity -> CommonCodeDTO
    public static CommonCodeDTO toDTO(CommonCodeEntity commonCodeEntity) {
        if (commonCodeEntity == null) {
            return null;
        }

        return new CommonCodeDTO(
                commonCodeEntity.getCode(),
                commonCodeEntity.getDisplayName(),
                commonCodeEntity.getParentCode(),
                commonCodeEntity.getCodeOrder(),
                commonCodeEntity.getDescription(),
                commonCodeEntity.getCreatedBy(),
                commonCodeEntity.getUpdatedBy(),
                commonCodeEntity.getCreatedAt(),
                commonCodeEntity.getUpdatedAt(),
                toDTOList(commonCodeEntity.getChildCodes())
        );
    }

    // CommonCodeDTO -> CommonCodeEntity
    public static CommonCodeEntity toEntity(CommonCodeDTO commonCodeDTO) {
        if (commonCodeDTO == null) {
            return null;
        }

        return CommonCodeEntity.of()
                .code(commonCodeDTO.getCode())
                .displayName(commonCodeDTO.getDisplayName())
                .parentCode(commonCodeDTO.getParentCode())
                .codeOrder(commonCodeDTO.getCodeOrder())
                .description(commonCodeDTO.getDescription())
                .build();
    }

    // List<CommonCodeEntity> -> List<CommonCodeDTO>
    public static List<CommonCodeDTO> toDTOList(List<CommonCodeEntity> commonCodes) {
        if (commonCodes == null || commonCodes.isEmpty()) {
            return Collections.emptyList();
        }

        return commonCodes.stream()
                .map(CommonCodeMapper::toDTO)
                .collect(Collectors.toList());
    }
}

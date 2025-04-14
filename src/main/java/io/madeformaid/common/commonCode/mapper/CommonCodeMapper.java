package io.madeformaid.common.commonCode.mapper;

import io.madeformaid.common.commonCode.dto.data.CommonCodeDTO;
import io.madeformaid.common.commonCode.entity.CommonCodeEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommonCodeMapper {
    // CommonCodeEntity -> CommonCodeDTO
    public CommonCodeDTO toDTO(CommonCodeEntity commonCodeEntity) {
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
    public CommonCodeEntity toEntity(CommonCodeDTO commonCodeDTO) {
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
    public List<CommonCodeDTO> toDTOList(List<CommonCodeEntity> commonCodes) {
        if (commonCodes == null || commonCodes.isEmpty()) {
            return Collections.emptyList();
        }

        return commonCodes.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}

package io.madeformaid.common.domain.commonCode.mapper;

import io.madeformaid.common.domain.commonCode.dto.data.CommonCodeDTO;
import io.madeformaid.common.domain.commonCode.entity.CommonCodeEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
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
                commonCodeEntity.getEtc1(),
                commonCodeEntity.getEtc2(),
                commonCodeEntity.getEtc3(),
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
                .codeOrder(
                        Optional.ofNullable(commonCodeDTO.getCodeOrder()).orElse(0)
                )
                .description(commonCodeDTO.getDescription())
                .etc1(commonCodeDTO.getEtc1())
                .etc2(commonCodeDTO.getEtc2())
                .etc3(commonCodeDTO.getEtc3())
                .childCodes(
                        toEntityList(commonCodeDTO.getChildCodes())
                )
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

    // List<CommonCodeDTO> -> List<CommonCodeEntity>
    public List<CommonCodeEntity> toEntityList(List<CommonCodeDTO> commonCodeDTOs) {
        if (commonCodeDTOs == null || commonCodeDTOs.isEmpty()) {
            return Collections.emptyList();
        }

        return commonCodeDTOs.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}

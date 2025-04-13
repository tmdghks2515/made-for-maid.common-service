package io.made_for_maid.common_service.commonCode.service;

import io.made_for_maid.common_service.commonCode.dto.data.CommonCodeDTO;
import io.made_for_maid.common_service.commonCode.entity.CommonCodeEntity;
import io.made_for_maid.common_service.commonCode.mapper.CommonCodeMapper;
import io.made_for_maid.common_service.commonCode.repository.CommonCodeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CommonCodeService {
    private final CommonCodeRepository commonCodeRepository;

    public CommonCodeDTO createCode(CommonCodeDTO commonCodeDTO) {
        CommonCodeEntity createdCommonCode = CommonCodeEntity.of()
                .code(commonCodeDTO.getCode())
                .displayName(commonCodeDTO.getDisplayName())
                .parentCode(commonCodeDTO.getParentCode())
                .codeOrder(commonCodeDTO.getCodeOrder())
                .description(commonCodeDTO.getDescription())
                .build();

        CommonCodeEntity savedCommonCode = commonCodeRepository.save(createdCommonCode);

        return CommonCodeMapper.toDTO(savedCommonCode);
    }
}

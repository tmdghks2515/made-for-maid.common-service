package io.madeformaid.common.commonCode.service;

import io.madeformaid.common.commonCode.dto.data.CommonCodeDTO;
import io.madeformaid.common.commonCode.entity.CommonCodeEntity;
import io.madeformaid.common.commonCode.mapper.CommonCodeMapper;
import io.madeformaid.common.commonCode.repository.CommonCodeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CommonCodeService {
    private final CommonCodeRepository commonCodeRepository;
    private final CommonCodeMapper commonCodeMapper;

    public CommonCodeDTO createCode(CommonCodeDTO commonCodeDTO) {
        CommonCodeEntity createdCommonCode = CommonCodeEntity.of()
                .code(commonCodeDTO.getCode())
                .displayName(commonCodeDTO.getDisplayName())
                .parentCode(commonCodeDTO.getParentCode())
                .codeOrder(commonCodeDTO.getCodeOrder())
                .description(commonCodeDTO.getDescription())
                .build();

        CommonCodeEntity savedCommonCode = commonCodeRepository.save(createdCommonCode);

        return commonCodeMapper.toDTO(savedCommonCode);
    }
}

package io.madeformaid.common.domain.commonCode.service;

import io.madeformaid.common.domain.commonCode.dto.data.CommonCodeDTO;
import io.madeformaid.common.domain.commonCode.entity.CommonCodeEntity;
import io.madeformaid.common.domain.commonCode.mapper.CommonCodeMapper;
import io.madeformaid.common.domain.commonCode.repository.CommonCodeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
                .codeOrder(
                        Optional.ofNullable(commonCodeDTO.getCodeOrder())
                                .orElse(0)
                )
                .description(commonCodeDTO.getDescription())
                .build();

        CommonCodeEntity savedCommonCode = commonCodeRepository.save(createdCommonCode);

        return commonCodeMapper.toDTO(savedCommonCode);
    }

    public List<CommonCodeDTO> getCodeTree() {
        return commonCodeMapper.toDTOList(
                commonCodeRepository.findAllRootCodesWithChildCodes()
        );
    }
}

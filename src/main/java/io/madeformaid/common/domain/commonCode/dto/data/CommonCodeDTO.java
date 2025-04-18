package io.madeformaid.common.domain.commonCode.dto.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class CommonCodeDTO {
    private String code;
    private String displayName;
    private String parentCode;
    private Integer codeOrder;
    private String description;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<CommonCodeDTO> childCodes;
}

package io.madeformaid.common.domain.commonCode.dto.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CommonCodeDTO {
    private String code;
    private String displayName;
    private String parentCode;
    private Integer codeOrder;
    private String description;
    private String etc1;
    private String etc2;
    private String etc3;
    private List<CommonCodeDTO> childCodes;
}

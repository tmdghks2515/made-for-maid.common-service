package io.madeformaid.common.domain.image.dto.data;

import io.madeformaid.common.domain.commonCode.vo.enums.ImageType;
import lombok.Builder;

@Builder(builderMethodName = "of")
public class ImageDTO {
    private String id;
    private ImageType imageType;
    private String fileName;
    private String path;
}

package io.madeformaid.common.domain.commonCode.dto.command;

import io.madeformaid.common.domain.commonCode.vo.enums.ImageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@AllArgsConstructor
public class UploadImageCommand {
    final private MultipartFile file;
    final private ImageType imageType;
}

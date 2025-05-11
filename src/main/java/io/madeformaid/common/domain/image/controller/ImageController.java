package io.madeformaid.common.domain.image.controller;

import io.madeformaid.common.domain.commonCode.vo.enums.ImageType;
import io.madeformaid.common.domain.image.dto.command.UploadImageCommand;
import io.madeformaid.common.domain.image.dto.data.ImageDTO;
import io.madeformaid.common.domain.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/common/image")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<ImageDTO> uploadImage(
            @RequestParam("file") MultipartFile file,
            @RequestParam("imageType") ImageType imageType
    ) {
        return ResponseEntity.ok(
                imageService.upload(
                        new UploadImageCommand(file, imageType)
                )
        );
    }
}

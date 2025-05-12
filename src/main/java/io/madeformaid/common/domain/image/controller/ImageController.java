package io.madeformaid.common.domain.image.controller;

import io.madeformaid.common.domain.commonCode.vo.enums.ImageType;
import io.madeformaid.common.domain.image.dto.command.UploadImageCommand;
import io.madeformaid.common.domain.image.dto.data.ImageDTO;
import io.madeformaid.common.domain.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/common/image")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @PostMapping(value = "/upload",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ImageDTO> uploadImage(
            @RequestParam("file") MultipartFile file,
            @RequestParam("imageType") ImageType imageType
    ) {
        ImageDTO savedImage = imageService.upload(
                new UploadImageCommand(file, imageType)
        );

        return ResponseEntity.ok(savedImage);
    }
}

package io.madeformaid.common.commonCode.controller;

import io.madeformaid.common.commonCode.dto.data.CommonCodeDTO;
import io.madeformaid.common.commonCode.service.CommonCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common/code")
@RequiredArgsConstructor
public class CommonCodeController {
    private final CommonCodeService commonCodeService;

    @PostMapping("/create")
    public ResponseEntity<CommonCodeDTO> createCode(@RequestBody CommonCodeDTO commonCodeDTO) {
        return ResponseEntity.ok(commonCodeService.createCode(commonCodeDTO));
    }
}

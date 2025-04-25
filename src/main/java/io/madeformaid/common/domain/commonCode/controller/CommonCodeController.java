package io.madeformaid.common.domain.commonCode.controller;

import io.madeformaid.common.domain.commonCode.dto.data.CommonCodeDTO;
import io.madeformaid.common.domain.commonCode.service.CommonCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/common/code")
@RequiredArgsConstructor
public class CommonCodeController {
    private final CommonCodeService commonCodeService;

    @PostMapping("/create")
    public ResponseEntity<CommonCodeDTO> createCode(@RequestBody CommonCodeDTO commonCodeDTO) {
        return ResponseEntity.ok(commonCodeService.createCode(commonCodeDTO));
    }

    @GetMapping("/tree")
    public ResponseEntity<List<CommonCodeDTO>> getCodeTree() {
        return ResponseEntity.ok(commonCodeService.getCodeTree());
    }
}

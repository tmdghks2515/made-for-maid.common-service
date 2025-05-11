package io.madeformaid.common.domain.commonCode.vo.enums;

public enum ImageStatus {
    UPLOADED,
    USING,
    UNUSED, // 이미지 삭제 시, S3에서 삭제 후 DB에서 삭제 (S3 실패하면 롤백 없이 UNUSED 유지)
}

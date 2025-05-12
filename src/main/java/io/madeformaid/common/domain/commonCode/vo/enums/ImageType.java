package io.madeformaid.common.domain.commonCode.vo.enums;

import lombok.Getter;

@Getter
public enum ImageType {
    PROFILE("upload/original/user/profile/"),
    SHOP_MENU("upload/original/shop/menu/"),
    ;

    private final String basePath;

    ImageType(String basePath) {
        this.basePath = basePath;
    }
}

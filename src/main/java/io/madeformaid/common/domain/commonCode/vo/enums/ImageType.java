package io.madeformaid.common.domain.commonCode.vo.enums;

import lombok.Getter;

@Getter
public enum ImageType {
    PROFILE("/upload/user/profile/"),
    SHOP_MENU("/upload/shop/menu/"),
    ;

    private String basePath;

    ImageType(String basePath) {
        this.basePath = basePath;
    }
}

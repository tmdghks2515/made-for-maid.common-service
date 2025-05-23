package io.madeformaid.common.domain.image.entity;

import io.madeformaid.common.domain.commonCode.vo.enums.ImageStatus;
import io.madeformaid.common.domain.commonCode.vo.enums.ImageType;
import io.madeformaid.webmvc.jpa.entity.BaseEntity;
import io.madeformaid.webmvc.jpa.idGenerator.ShortId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "image")
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "of")
@Getter
public class ImageEntity extends BaseEntity {
    @Id
    @ShortId
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "image_type", nullable = false)
    private ImageType imageType;

    @Enumerated(EnumType.STRING)
    @Column(name = "image_status", nullable = false)
    private ImageStatus imageStatus;

    @Column(name = "path", nullable = false)
    private String path;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    public void using() {
        if (imageStatus != ImageStatus.UPLOADED) {
            throw new IllegalStateException("사용 처리 불가한 이미지 입니다.");
        }
        this.imageStatus = ImageStatus.USING;
    }

    public void unused() {
        if (imageStatus != ImageStatus.USING) {
            throw new IllegalStateException("미사용 처리 불가한 이미지 입니다.");
        }
        this.imageStatus = ImageStatus.UNUSED;
    }
}

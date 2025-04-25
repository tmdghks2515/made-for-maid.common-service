package io.madeformaid.common.domain.commonCode.entity;

import io.madeformaid.webmvc.jpa.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "common_code")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA 프록시 생성을 위한 기본 생성자
@AllArgsConstructor // Builder와 같이 사용하면 편함
@Builder(builderMethodName = "of") // 생성자 대신 빌더 패턴 사용
@ToString(exclude = {"childCodes"}) // 순환 참조 방지
@EqualsAndHashCode(of = "code", callSuper = false) // 엔티티 식별자로 equals/hashCode 정의
public class CommonCodeEntity extends BaseEntity {
    @Id
    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "parent_code")
    private String parentCode;

    @ManyToOne
    @JoinColumn(name = "parent_code", insertable = false, updatable = false)
    private CommonCodeEntity parentCodeEntity;

    @Column(name = "display_name", nullable = false, length = 50)
    private String displayName;

    @Column(name = "description")
    private String description;

    @Column(name = "etc1")
    private String etc1;

    @Column(name = "etc2")
    private String etc2;

    @Column(name = "etc3")
    private String etc3;

    @Column(name = "code_order", nullable = false)
    private Integer codeOrder;

    @OneToMany(mappedBy = "parentCode")
    @OrderBy("codeOrder ASC") // 자식 코드 정렬
    private List<CommonCodeEntity> childCodes;
}

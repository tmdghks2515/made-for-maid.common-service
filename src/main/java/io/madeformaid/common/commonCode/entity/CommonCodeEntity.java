package io.madeformaid.common.commonCode.entity;

import io.madeformaid.shared.jpa.entity.BaseEntity;
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
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @Column(name = "display_name", nullable = false, length = 50)
    private String displayName;

    @Column(name = "parent_code")
    private String parentCode;

    @Column(name = "code_order", nullable = false)
    private Integer codeOrder;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "parent_code", insertable = false, updatable = false)
    private CommonCodeEntity parentCodeEntity;

    @OneToMany(mappedBy = "parentCode", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("codeOrder ASC") // 자식 코드 정렬
    private List<CommonCodeEntity> childCodes;
}

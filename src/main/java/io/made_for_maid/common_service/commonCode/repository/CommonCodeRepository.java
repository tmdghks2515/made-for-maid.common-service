package io.made_for_maid.common_service.commonCode.repository;

import io.made_for_maid.common_service.commonCode.entity.CommonCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommonCodeRepository extends
        JpaRepository<CommonCodeEntity, String>,
        JpaSpecificationExecutor<CommonCodeEntity>,
        CommonCodeCustomRepository
{
    // 기본 CRUD 메서드는 JpaRepository에서 제공
    // 추가적인 쿼리 메서드는 필요에 따라 정의
}

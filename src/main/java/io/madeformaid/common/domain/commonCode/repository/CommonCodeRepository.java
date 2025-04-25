package io.madeformaid.common.domain.commonCode.repository;

import io.madeformaid.common.domain.commonCode.entity.CommonCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommonCodeRepository extends
        JpaRepository<CommonCodeEntity, String>,
        JpaSpecificationExecutor<CommonCodeEntity>,
        CommonCodeCustomRepository
{
    @Query("""
            SELECT DISTINCT c
            FROM CommonCodeEntity c
            LEFT JOIN FETCH c.childCodes
            WHERE c.parentCode IS NULL
    """)
    List<CommonCodeEntity> findAllRootCodesWithChildCodes();
}

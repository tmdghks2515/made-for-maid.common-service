package io.madeformaid.common.domain.image.repository;

import io.madeformaid.common.domain.image.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, String> {
}

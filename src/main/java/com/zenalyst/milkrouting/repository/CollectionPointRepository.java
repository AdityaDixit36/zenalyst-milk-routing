package com.zenalyst.milkrouting.repository;

import com.zenalyst.milkrouting.entity.CollectionPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionPointRepository
        extends JpaRepository<CollectionPoint, Long> {
}
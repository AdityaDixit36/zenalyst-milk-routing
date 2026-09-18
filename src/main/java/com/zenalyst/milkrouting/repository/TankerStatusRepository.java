package com.zenalyst.milkrouting.repository;

import com.zenalyst.milkrouting.entity.TankerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TankerStatusRepository
        extends JpaRepository<TankerStatus, Long> {

    Optional<TankerStatus> findByTankerId(Long tankerId);
}
package com.zenalyst.milkrouting.service;

import com.zenalyst.milkrouting.entity.TankerStatus;
import com.zenalyst.milkrouting.repository.TankerStatusRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TankerStatusService {

    private final TankerStatusRepository repository;

    public TankerStatusService(TankerStatusRepository repository) {
        this.repository = repository;
    }

    public TankerStatus updateStatus(TankerStatus status) {
        status.setLastUpdated(LocalDateTime.now());
        return repository.save(status);
    }

    public TankerStatus getStatus(Long tankerId) {
        return repository.findByTankerId(tankerId)
                .orElseThrow(() -> new RuntimeException("Tanker status not found"));
    }
}
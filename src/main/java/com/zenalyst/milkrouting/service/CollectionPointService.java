package com.zenalyst.milkrouting.service;

import com.zenalyst.milkrouting.entity.CollectionPoint;
import com.zenalyst.milkrouting.repository.CollectionPointRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionPointService {

    private final CollectionPointRepository repository;

    public CollectionPointService(CollectionPointRepository repository) {
        this.repository = repository;
    }

    public CollectionPoint create(CollectionPoint point) {
        return repository.save(point);
    }

    public List<CollectionPoint> getAll() {
        return repository.findAll();
    }
}
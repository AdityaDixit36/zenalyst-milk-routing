package com.zenalyst.milkrouting.service;

import com.zenalyst.milkrouting.entity.Tanker;
import com.zenalyst.milkrouting.repository.TankerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TankerService {

    private final TankerRepository repository;

    public TankerService(TankerRepository repository) {
        this.repository = repository;
    }

    public Tanker create(Tanker tanker) {
        return repository.save(tanker);
    }

    public List<Tanker> getAll() {
        return repository.findAll();
    }
}
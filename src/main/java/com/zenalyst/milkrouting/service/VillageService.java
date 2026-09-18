package com.zenalyst.milkrouting.service;

import com.zenalyst.milkrouting.entity.Village;
import com.zenalyst.milkrouting.repository.VillageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageService {

    private final VillageRepository villageRepository;

    public VillageService(VillageRepository villageRepository) {
        this.villageRepository = villageRepository;
    }

    public Village createVillage(Village village) {
        return villageRepository.save(village);
    }

    public List<Village> getAllVillages() {
        return villageRepository.findAll();
    }

    public Village getVillageById(Long id) {
        return villageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Village not found"));
    }

    public Village updateVillage(Long id, Village village) {

        Village existingVillage = villageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Village not found"));

        existingVillage.setName(village.getName());

        return villageRepository.save(existingVillage);
    }
}
package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.Village;
import com.zenalyst.milkrouting.service.VillageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/villages")
public class VillageController {

    private final VillageService villageService;

    public VillageController(VillageService villageService) {
        this.villageService = villageService;
    }

    @PostMapping
    public Village createVillage(@RequestBody Village village) {
        return villageService.createVillage(village);
    }

    @GetMapping("/{id}")
    public Village getVillageById(@PathVariable Long id) {
        return villageService.getVillageById(id);
    }

    @PutMapping("/{id}")
    public Village updateVillage(
            @PathVariable Long id,
            @RequestBody Village village) {

        return villageService.updateVillage(id, village);
    }
}
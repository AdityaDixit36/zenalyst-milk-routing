package com.zenalyst.milkrouting.repository;

import com.zenalyst.milkrouting.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}
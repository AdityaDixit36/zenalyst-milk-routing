package com.zenalyst.milkrouting.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tanker_status")
public class TankerStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "tanker_id", unique = true)
    private Tanker tanker;

    private Double latitude;
    private Double longitude;

    private Integer currentStopSequence;

    private LocalDateTime lastUpdated;

    public TankerStatus() {
    }

    public Long getId() {
        return id;
    }

    public Tanker getTanker() {
        return tanker;
    }

    public void setTanker(Tanker tanker) {
        this.tanker = tanker;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getCurrentStopSequence() {
        return currentStopSequence;
    }

    public void setCurrentStopSequence(Integer currentStopSequence) {
        this.currentStopSequence = currentStopSequence;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
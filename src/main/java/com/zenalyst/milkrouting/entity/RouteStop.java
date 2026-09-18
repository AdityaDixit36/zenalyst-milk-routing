package com.zenalyst.milkrouting.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "route_stops")
public class RouteStop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "collection_point_id")
    private CollectionPoint collectionPoint;

    private Integer sequenceNumber;

    private Integer expectedArrivalMinutes;

    public RouteStop() {
    }

    public Long getId() {
        return id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public CollectionPoint getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(CollectionPoint collectionPoint) {
        this.collectionPoint = collectionPoint;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getExpectedArrivalMinutes() {
        return expectedArrivalMinutes;
    }

    public void setExpectedArrivalMinutes(Integer expectedArrivalMinutes) {
        this.expectedArrivalMinutes = expectedArrivalMinutes;
    }
}
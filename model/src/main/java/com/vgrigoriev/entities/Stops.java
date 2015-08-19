package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * author vgrigoriev on 19.08.2015.
 */
@Entity
@Table(name = "stops")
public class Stops extends BaseEntity {

    @ManyToOne
    private Cities cityId;

    @ManyToOne
    private Route routeId;

    @Column(nullable = false)
    private int stopNumber;

    public Cities getCityId() {
        return cityId;
    }

    public void setCityId(Cities cityId) {
        this.cityId = cityId;
    }

    public Route getRouteId() {
        return routeId;
    }

    public void setRouteId(Route routeId) {
        this.routeId = routeId;
    }

    public int getStopNumber() {
        return stopNumber;
    }

    public void setStopNumber(int stopNumber) {
        this.stopNumber = stopNumber;
    }
}

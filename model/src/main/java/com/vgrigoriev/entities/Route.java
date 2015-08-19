package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * author vgrigoriev on 19.08.2015.
 */
@Entity
@Table(name = "route")
public class Route extends BaseEntity {

    @OneToMany(mappedBy = "routeId")
    private List<Stops> stops;

    @Column(nullable = false)
    private String name;

    public List<Stops> getStops() {
        return stops;
    }

    public void setStops(List<Stops> stops) {
        this.stops = stops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

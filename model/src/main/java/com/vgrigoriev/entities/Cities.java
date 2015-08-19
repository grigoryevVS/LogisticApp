package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * author vgrigoriev on 19.08.2015.
 */
@Entity
@Table(name = "cities")
public class Cities extends BaseEntity {

    @Column(nullable = false)
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

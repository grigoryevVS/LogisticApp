package com.vgrigoriev.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * author vgrigoriev on 06.08.2015.
 */
@Entity
@Table(name = "trucks")
public class Driver extends BaseEntity {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(nullable = false)
    @Digits(integer = 12, fraction = 0)
    private long licence;

    @ManyToOne
    private Truck truck;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private DriverStatus status;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getLicence() {
        return licence;
    }

    public void setLicence(long licence) {
        this.licence = licence;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }
}

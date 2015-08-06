package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * author vgrigoriev on 06.08.2015.
 */
@Entity
@Table
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


}

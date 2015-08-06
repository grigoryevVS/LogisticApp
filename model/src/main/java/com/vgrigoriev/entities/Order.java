package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * author vgrigoriev on 06.08.2015.
 */
public class Order extends BaseEntity {

    @Column(nullable = false)
    private String source;

    @Column(nullable = false)
    private String destination;

    @Column(nullable = false)
    private int tonnage;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deadline;

    @OneToOne
    private Truck orderTruck;

}

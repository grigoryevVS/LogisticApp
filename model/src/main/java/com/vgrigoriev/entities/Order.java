package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * author vgrigoriev on 06.08.2015.
 */
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @ManyToOne
    private Route route;

    @Column(nullable = false)
    private int tonnage;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deadline;

    @ManyToOne
    private Truck orderTruck;

    @ManyToOne
    private Customer customer;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Truck getOrderTruck() {
        return orderTruck;
    }

    public void setOrderTruck(Truck orderTruck) {
        this.orderTruck = orderTruck;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

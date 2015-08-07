package com.vgrigoriev.rest.entities;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * author vgrigoriev on 06.08.2015.
 */
public class Customer extends BaseEntity {

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @Column(nullable = false)
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

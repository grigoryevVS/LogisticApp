package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * author vgrigoriev on 06.08.2015.
 */
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @Column(nullable = false)
    private String name;

    @Column
    private String phone;



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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

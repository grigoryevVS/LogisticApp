package com.vgrigoriev.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * author vgrigoriev on 06.08.2015.
 */
@Entity
@Table(name="trucks")
public class Truck extends BaseEntity{

    @Column(nullable = false)
    @Size(min = 6, max = 12)
    private String number;

    @Column
    private long mileAge;

    @Column
    private int capacity;

    @Column
    private Date age;

    @OneToMany ( mappedBy = "truck")
    private Set<Driver> drivers;

    @OneToMany(mappedBy = "linkedTruck")
    private List<Order> orders;





    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getMileAge() {
        return mileAge;
    }

    public void setMileAge(long mileAge) {
        this.mileAge = mileAge;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

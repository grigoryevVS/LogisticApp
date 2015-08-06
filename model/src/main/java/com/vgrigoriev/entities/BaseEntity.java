package com.vgrigoriev.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * author vgrigoriev on 06.08.2015.
 * Used as base entity to load repeatable columns
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * time of creation
     */
    @Column(columnDefinition = "timestamp default now()", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    /**
     * Pre save. Set created date to current date
     */
    @PrePersist
    public void preSave() {
        created = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


}

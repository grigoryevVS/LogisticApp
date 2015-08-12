package com.vgrigoriev.dao;

import com.vgrigoriev.entities.BaseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * author vgrigoriev on 12.08.2015.
 */
@Repository
public class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public T get(Long id) {
        return null;
    }

    @Override
    public List<T> get() {
        return null;
    }

    @Override
    public T merge(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void update(T entity) {

    }
}

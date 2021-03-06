package com.vgrigoriev.dao;

import java.util.List;

/**
 * author vgrigoriev on 12.08.2015.
 */
public interface GenericDao<T> {

    T get(Long id);

    List<T> getAll();

    T merge(T entity);

    void delete(T entity);

    void create(T entity);
}

package com.spdukraine.mvc.repository.dao;


import java.util.List;

public interface GenericDao<E, K> {
    void add(E entity);
    void update(E entity);
    void delete(E entity);
    E find(K key);
    List<E> list();
}

package com.spdukraine.mvc.repository.impl;


import com.spdukraine.mvc.repository.dao.GenericDao;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDao<E, K> implements GenericDao<E, K> {

    private List<E> entities = new ArrayList<E>();

    @Override
    public void add(E entity) {
        entities.add(entity);
    }

    @Override
    public void update(E entity) {
        throw new UnsupportedOperationException("Not " +
                "supported in dummy in-memory impl!");
    }

    @Override
    public void delete(E entity) {
        entities.remove(entity);
    }

    @Override
    public E find(K key) {
        if(entities.isEmpty()) {
            return null;
        }
        return entities.get(0);
    }

    @Override
    public List<E> list() {
        return entities;
    }
}

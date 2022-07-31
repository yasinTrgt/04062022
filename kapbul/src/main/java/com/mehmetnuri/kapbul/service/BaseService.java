package com.mehmetnuri.kapbul.service;

import com.mehmetnuri.kapbul.entity.BaseEntity;
import com.mehmetnuri.kapbul.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseEntity, R extends BaseRepository> {

    @Autowired
    public R repository;


    public List<T> findAll() {
        List<T> entityList = repository.findAll();

        return entityList;
    }

    public T save(T t) {
        return (T) repository.save(t);
    }

    public void delete(Long entityId) {
        repository.delete(entityId);
    }
}

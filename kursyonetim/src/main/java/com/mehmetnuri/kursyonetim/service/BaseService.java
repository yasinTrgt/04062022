package com.mehmetnuri.kursyonetim.service;

import com.mehmetnuri.kursyonetim.entity.BaseEntity;
import com.mehmetnuri.kursyonetim.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BaseService <T extends BaseEntity, R extends BaseRepository> {

    @Autowired
    public  R repository;

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


    public T update(Long entityId, T entity) {
        Optional<T> optionalT = repository.findById(entityId);

        if (optionalT.isPresent()) {
            entity.setId(entityId);
            repository.save(entity);

        }

        return entity;
    }
}

package com.mehmetnuri.kapbul.controller;

import com.mehmetnuri.kapbul.entity.BaseEntity;
import com.mehmetnuri.kapbul.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T extends BaseEntity, S extends BaseService> {

    @Autowired
    S service;

    @GetMapping(path = "/findAll")
    public List<T> findAll() {

        List<T> entityList = service.findAll();
        return entityList;
    }

    @PostMapping(path = "/save", consumes = "application/json")
    public T save(@RequestBody T entity) {
        return (T) service.save(entity);
    }

    @DeleteMapping(path = "/delete")
    public void delete(@RequestParam Long entityId) {
        service.delete(entityId);
    }
}

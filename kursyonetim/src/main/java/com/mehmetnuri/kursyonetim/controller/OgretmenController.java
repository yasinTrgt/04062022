package com.mehmetnuri.kursyonetim.controller;

import com.mehmetnuri.kursyonetim.entity.Ogretmen;
import com.mehmetnuri.kursyonetim.repository.OgretmenRepository;
import com.mehmetnuri.kursyonetim.service.OgretmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ogretmen")
public class OgretmenController extends BaseController<Ogretmen, OgretmenService> {

    @Autowired
    OgretmenRepository repository;


    @GetMapping
    public List<Ogretmen> findAllOgretmen() {
        return repository.findAllOgretmen();
    }
}

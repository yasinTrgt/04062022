package com.mehmetnuri.kapbul.controller;

import com.mehmetnuri.kapbul.entity.Kap;
import com.mehmetnuri.kapbul.repository.KapRepository;
import com.mehmetnuri.kapbul.service.KapServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kap")
public class KapController extends BaseController<Kap, KapServis> {

    @Autowired
    KapRepository repository;

    @GetMapping()
    public List<Kap> getAll() {
        return repository.findAllKap();
    }

    @GetMapping( "ara/{aranacak_kelime}")
    public List<Kap> ara(@PathVariable String aranacak_kelime) {
        return repository.findKapByAdi(aranacak_kelime);
    }

    @GetMapping("/{kapId}")
    public Optional<Kap> getById(@PathVariable Long kapId) {
        return repository.findById(kapId);
    }


}

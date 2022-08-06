package com.mehmetnuri.kursyonetim.controller;

import com.mehmetnuri.kursyonetim.entity.Kategori;
import com.mehmetnuri.kursyonetim.repository.BaseRepository;
import com.mehmetnuri.kursyonetim.service.KategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kategori")
public class KategoryController extends BaseController<Kategori, KategoryService> {
}

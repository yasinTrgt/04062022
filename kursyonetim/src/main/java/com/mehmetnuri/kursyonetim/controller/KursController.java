package com.mehmetnuri.kursyonetim.controller;

import com.mehmetnuri.kursyonetim.entity.Kurs;
import com.mehmetnuri.kursyonetim.service.KursService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kurs")
public class KursController extends BaseController<Kurs, KursService> {
}

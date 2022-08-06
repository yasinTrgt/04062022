package com.mehmetnuri.kursyonetim.repository;

import com.mehmetnuri.kursyonetim.entity.Ogretmen;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OgretmenRepository extends BaseRepository<Ogretmen> {


    @Query("select ogretmen from Ogretmen  ogretmen")
    List<Ogretmen> findAllOgretmen();

    @Query("select ogretmen from Ogretmen  ogretmen where ogretmen.ad like ?1%")
    List<Ogretmen> findOgretmenByAdi(String adi);


    @Query("select ogretmen from Ogretmen  ogretmen where ogretmen.soyad like ?1%")
    List<Ogretmen> findOgretmenBySoyadi(String soyad);

    @Query("select ogretmen from Ogretmen  ogretmen where ogretmen.tc= ?1")
    Ogretmen findOgretmenByTcNo(Long tcNo);
}

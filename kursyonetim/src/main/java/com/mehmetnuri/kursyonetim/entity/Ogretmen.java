package com.mehmetnuri.kursyonetim.entity;

import com.mehmetnuri.kursyonetim.enums.EnumAP;

import javax.persistence.*;

@Entity
@Table(name = "ogretmenler")
public class Ogretmen extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String ad;

    @Column
    private String soyad;

    @Column
    private Long tc;


    @Enumerated(EnumType.STRING)
    private EnumAP durum;


    @Override
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    public EnumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumAP durum) {
        this.durum = durum;
    }
}

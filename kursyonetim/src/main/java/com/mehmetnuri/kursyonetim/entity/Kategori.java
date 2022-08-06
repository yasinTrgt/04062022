package com.mehmetnuri.kursyonetim.entity;


import com.mehmetnuri.kursyonetim.enums.EnumAP;

import javax.persistence.*;

@Entity
@Table(name = "kategoriler")
public class Kategori extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String ad;

    @Column
    private String aciklama;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Kategori ustKategori;

    @Enumerated(EnumType.STRING)
    private EnumAP durum;


    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Kategori getUstKategori() {
        return ustKategori;
    }

    public void setUstKategori(Kategori ustKategori) {
        this.ustKategori = ustKategori;
    }

    public EnumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumAP durum) {
        this.durum = durum;
    }
}

package com.mehmetnuri.kursyonetim.entity;


import com.mehmetnuri.kursyonetim.enums.EnumKursDurumu;
import com.mehmetnuri.kursyonetim.enums.EnumKursTipi;

import javax.persistence.*;

@Entity
@Table(name = "kurslar")
public class Kurs extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String  kursKodu;

    @Column
    private String kursAdi;

    @Column
    private String kursAciklama;

    @Column String kursKatilimKosullari;

    @ManyToOne
    @JoinColumn(name = "ogretmen_id")
    private Ogretmen ogretmen;

    @Enumerated(EnumType.STRING)
    private EnumKursDurumu kursDurumu;

    @Enumerated(EnumType.STRING)
    private EnumKursTipi kursTipi;

    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private Kategori kategori;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getKursKodu() {
        return kursKodu;
    }

    public void setKursKodu(String kursKodu) {
        this.kursKodu = kursKodu;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public String getKursAciklama() {
        return kursAciklama;
    }

    public void setKursAciklama(String kursAciklama) {
        this.kursAciklama = kursAciklama;
    }

    public String getKursKatilimKosullari() {
        return kursKatilimKosullari;
    }

    public void setKursKatilimKosullari(String kursKatilimKosullari) {
        this.kursKatilimKosullari = kursKatilimKosullari;
    }

    public Ogretmen getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Ogretmen ogretmen) {
        this.ogretmen = ogretmen;
    }

    public EnumKursDurumu getKursDurumu() {
        return kursDurumu;
    }

    public void setKursDurumu(EnumKursDurumu kursDurumu) {
        this.kursDurumu = kursDurumu;
    }

    public EnumKursTipi getKursTipi() {
        return kursTipi;
    }

    public void setKursTipi(EnumKursTipi kursTipi) {
        this.kursTipi = kursTipi;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
}

package com.mehmetnuri.arabasatis.araba;

public class Araba {

    private String marka;
    private String rengi;
    private Long kapiSayisi;
    private String yakitCinsi;
    private String model;
    private Long maksimumHiz;
    private Double fiyat;
    private String vitesTipi;

    public Araba() {
    }

    public Araba(String marka, String rengi, Long kapiSayisi, String yakitCinsi, String model, Long maksimumHiz, Double fiyat, String vitesTipi) {
        this.marka = marka;
        this.rengi = rengi;
        this.kapiSayisi = kapiSayisi;
        this.yakitCinsi = yakitCinsi;
        this.model = model;
        this.maksimumHiz = maksimumHiz;
        this.fiyat = fiyat;
        this.vitesTipi = vitesTipi;
    }

    public String getMarka() {
        return marka;
    }

    public String getRengi() {
        return rengi;
    }

    public Long getKapiSayisi() {
        return kapiSayisi;
    }

    public String getYakitCinsi() {
        return yakitCinsi;
    }

    public String getModel() {
        return model;
    }

    public Long getMaksimumHiz() {
        return maksimumHiz;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public void setKapiSayisi(Long kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void setYakitCinsi(String yakitCinsi) {
        this.yakitCinsi = yakitCinsi;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaksimumHiz(Long maksimumHiz) {
        this.maksimumHiz = maksimumHiz;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }

    @Override
    public String toString() {
        return
                "marka='" + marka + '\'' +
                ", rengi='" + rengi + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                ", yakitCinsi='" + yakitCinsi + '\'' +
                ", model='" + model + '\'' +
                ", maksimumHiz=" + maksimumHiz +
                ", fiyat=" + fiyat +
                ", vitesTipi='" + vitesTipi + '\'' ;
    }
}

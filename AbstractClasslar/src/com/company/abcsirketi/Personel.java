package com.company.abcsirketi;

public abstract class Personel {

    private int yasi;
    private String adSoyad;

    public abstract double MaaasHesapla();

    public Personel() {
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
}

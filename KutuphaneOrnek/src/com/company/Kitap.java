package com.company;

import com.company.enums.EnumKitapDurumu;
import com.company.enums.EnumKitapTuru;

public abstract class Kitap {

    private String kitapAdi;
    private double gunlukKirasi;
    private double gunlukCezaiUcreti;
    private String yazar;
    private String basimEvi;
    private int basimYili;
    private int sayfaSayisi;
    private EnumKitapDurumu durumu;
    private EnumKitapTuru turu;
    private int cezaGunSayisi;


    public Kitap() {
    }

    public abstract double cezaiUcretHesapla();

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public double getGunlukKirasi() {
        return gunlukKirasi;
    }

    public void setGunlukKirasi(double gunlukKirasi) {
        this.gunlukKirasi = gunlukKirasi;
    }

    public double getGunlukCezaiUcreti() {
        return gunlukCezaiUcreti;
    }

    public void setGunlukCezaiUcreti(double gunlukCezaiUcreti) {
        this.gunlukCezaiUcreti = gunlukCezaiUcreti;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getBasimEvi() {
        return basimEvi;
    }

    public void setBasimEvi(String basimEvi) {
        this.basimEvi = basimEvi;
    }

    public int getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(int basimYili) {
        this.basimYili = basimYili;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public EnumKitapDurumu getDurumu() {
        return durumu;
    }

    public void setDurumu(EnumKitapDurumu durumu) {
        this.durumu = durumu;
    }

    public EnumKitapTuru getTuru() {
        return turu;
    }

    public void setTuru(EnumKitapTuru turu) {
        this.turu = turu;
    }

    public int getCezaGunSayisi() {
        return cezaGunSayisi;
    }

    public void setCezaGunSayisi(int cezaGunSayisi) {
        this.cezaGunSayisi = cezaGunSayisi;
    }
}

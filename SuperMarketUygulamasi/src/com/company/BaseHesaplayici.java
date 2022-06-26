package com.company;

public abstract class BaseHesaplayici {

    private int kilo;
    private int tane;
    private int litre;
    private double fiyat;


    public double ekmekHesapla() {
        return this.tane * this.fiyat;
    }

    public double sutHesapla() {
        return this.litre * this.fiyat;
    }

    public double elma() {
        return this.kilo * this.fiyat;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getTane() {
        return tane;
    }

    public void setTane(int tane) {
        this.tane = tane;
    }

    public int getLitre() {
        return litre;
    }

    public void setLitre(int litre) {
        this.litre = litre;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}

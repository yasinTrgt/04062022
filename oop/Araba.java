/**
 * erişim belirleyici SınıfAdı {
 * alanlar
 * <p>
 * davranıslar
 * }
 */

// PascalCase


package com.mehmetnuri.oop;

public class Araba {

    private String renk;
    private String marka;
    private int fiyat;

    // GET özelliğin değerini getirir

    // SET özelliğin değerini atar


    public Araba() {
        // Burası her zaman çalışır
    }

    public Araba(String renk, String marka, int fiyat) {
        this.renk = renk;
        this.marka = marka;
        this.fiyat = fiyat;
    }


    public Araba(String renk, String marka) {
        this.renk = renk;
        this.marka = marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public double aylikTaksit(int taksitsayisi) {

        Islemler islemler = new Islemler();

        double aylikTaksitTutari = islemler.bol(this.fiyat, taksitsayisi);

        return aylikTaksitTutari;

    }

    public void markagetir() {
        this.markaYaz();
    }

    private void markaYaz() {
        System.out.println(this.marka);
    }

}

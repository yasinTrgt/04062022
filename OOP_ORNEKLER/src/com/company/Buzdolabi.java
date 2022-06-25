package com.company;

public class Buzdolabi {

    private int uretimYili;
    private String modeli;
    private String marka;
    private int kapiSayisi;
    private int kapasite;
    private boolean buzlukAltta;

    public Buzdolabi(int uretimYili, String modeli, String marka, int kapiSayisi, int kapasite, boolean buzlukAltta) {
        this.uretimYili = uretimYili;
        this.modeli = modeli;
        this.marka = marka;
        this.kapiSayisi = kapiSayisi;
        this.kapasite = kapasite;
        this.buzlukAltta = buzlukAltta;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public boolean isBuzlukAltta() {
        return buzlukAltta;
    }

    public void setBuzlukAltta(boolean buzlukAltta) {
        this.buzlukAltta = buzlukAltta;
    }

    @Override
    public String toString() {
        return "Buzdolabi{" +
                "uretimYili=" + uretimYili +
                ", modeli='" + modeli + '\'' +
                ", marka='" + marka + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                ", kapasite=" + kapasite +
                ", buzlukAltta=" + buzlukAltta +
                '}';
    }
}

package com.company.model;

public class Arac implements com.company.interfaces.Arac {

    private String marka;
    private String model;
    private double fiyat;
    private String renk;


    public Arac() {
    }

    public void bilgiVer() {
        System.out.println(this.marka +" " + this.model);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public void ozellikYaz() {
        this.bilgiVer();
    }

    @Override
    public void markaYaz() {
        System.out.println(this.marka);
    }

    @Override
    public double fiyatYaz(String model) {
        return this.fiyat;
    }
}

package com.company.model;

public class Kamyon extends Arac{

    private Long dingilSayisi;
    private double maximumYukKapasitesi;
    private boolean yatakDurumu;
    private boolean adBlueDurumu;

    public Long getDingilSayisi() {
        return dingilSayisi;
    }

    public void setDingilSayisi(Long dingilSayisi) {
        this.dingilSayisi = dingilSayisi;
    }

    public double getMaximumYukKapasitesi() {
        return maximumYukKapasitesi;
    }

    public void setMaximumYukKapasitesi(double maximumYukKapasitesi) {
        this.maximumYukKapasitesi = maximumYukKapasitesi;
    }

    public boolean isYatakDurumu() {
        return yatakDurumu;
    }

    public void setYatakDurumu(boolean yatakDurumu) {
        this.yatakDurumu = yatakDurumu;
    }

    public boolean isAdBlueDurumu() {
        return adBlueDurumu;
    }

    public void setAdBlueDurumu(boolean adBlueDurumu) {
        this.adBlueDurumu = adBlueDurumu;
    }
}

package com.company.ders;

public abstract class Ders {

    private String ad;
    private int sinifNo;

    public abstract String getAdi();

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSinifNo() {
        return sinifNo;
    }

    public void setSinifNo(int sinifNo) {
        this.sinifNo = sinifNo;
    }
}

package com.company.sirket;

public abstract class Calisan {


    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private boolean askerlikDurumu;
    private String iseGirisTarihi;
    private String cepNumarasi;
    private boolean servisKullanimDurumu;
    private String unvan;

    public Calisan() {
    }

    public abstract String getAdi();

    public abstract String getSoyadi();

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public double getMaas() {
        return maas;
    }

    public boolean isAskerlikDurumu() {
        return askerlikDurumu;
    }

    public String getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public String getCepNumarasi() {
        return cepNumarasi;
    }

    public boolean isServisKullanimDurumu() {
        return servisKullanimDurumu;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void setAskerlikDurumu(boolean askerlikDurumu) {
        this.askerlikDurumu = askerlikDurumu;
    }

    public void setIseGirisTarihi(String iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public void setCepNumarasi(String cepNumarasi) {
        this.cepNumarasi = cepNumarasi;
    }

    public void setServisKullanimDurumu(boolean servisKullanimDurumu) {
        this.servisKullanimDurumu = servisKullanimDurumu;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", askerlikDurumu=" + askerlikDurumu +
                ", iseGirisTarihi='" + iseGirisTarihi + '\'' +
                ", cepNumarasi='" + cepNumarasi + '\'' +
                ", servisKullanimDurumu=" + servisKullanimDurumu +
                ", unvan='" + unvan + '\'' +
                '}';
    }
}

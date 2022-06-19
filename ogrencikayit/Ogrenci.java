package com.company.ogrencikayit;

public class Ogrenci {

    private String ad;
    private String soyad;
    private Long numara;
    private String universite;
    private String fakulte;
    private String bolum;
    private String sinif;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Long getNumara() {
        return numara;
    }

    public void setNumara(Long numara) {
        this.numara = numara;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", numara=" + numara +
                ", universite='" + universite + '\'' +
                ", fakulte='" + fakulte + '\'' +
                ", bolum='" + bolum + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}

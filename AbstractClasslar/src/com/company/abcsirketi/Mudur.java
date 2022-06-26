package com.company.abcsirketi;

public class Mudur extends Personel{

    private double maas;
    private String unvan;
    private double ekGosterge;

    @Override
    public double MaaasHesapla() {
        return this.maas + (ekGosterge / 3600);
    }

    public Mudur() {
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public double getEkGosterge() {
        return ekGosterge;
    }

    public void setEkGosterge(double ekGosterge) {
        this.ekGosterge = ekGosterge;
    }
}

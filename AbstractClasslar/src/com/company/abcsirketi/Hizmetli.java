package com.company.abcsirketi;

public class Hizmetli extends Personel{

    private double maas;
    private String birimi;


    @Override
    public double MaaasHesapla() {
        return this.maas;
    }

    public Hizmetli() {
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getBirimi() {
        return birimi;
    }

    public void setBirimi(String birimi) {
        this.birimi = birimi;
    }
}

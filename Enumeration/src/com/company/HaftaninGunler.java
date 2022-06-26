package com.company;

public enum HaftaninGunler {

    PAZARTESI("Pazartesi"),
    SALI("Salı"),
    CARSAMBA("Çarşamba"),
    PERSEMBE("Perşembe"),
    CUMA("Cuma"),
    CUMARTESI("Cumartesi"),
    PAZAR("Pazar");

    private String deger;

    HaftaninGunler(String deger) {
        this.deger = deger;
    }

    public String getDeger() {
        return deger;
    }
}

package com.company.enums;

public enum EnumKitapTuru {
    BILIM_KURGU("Bilim Kurgu"),
    TARIH("Tarih"),
    SAGLIK("Sağlık"),
    YABANCI_DIL("Yabancı Dil");


    private String turu;

    EnumKitapTuru(String turu) {
        this.turu = turu;
    }

    public String getTuru() {
        return turu;
    }
}

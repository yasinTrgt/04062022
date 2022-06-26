package com.company.enums;

public enum EnumKitapDurumu {
    MEVCUT("Mevcut"),
    KIRALAMADA("Kiralamada"),
    TEMIN_EDILECEK("Temin Edilecek");


    private String durum;

    EnumKitapDurumu(String durum) {
        this.durum = durum;
    }

    public String getDurum() {
        return durum;
    }
}

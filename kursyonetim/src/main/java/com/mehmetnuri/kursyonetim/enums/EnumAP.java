package com.mehmetnuri.kursyonetim.enums;

public enum EnumAP implements BaseEnum{
    AKTIF("Aktif"),
    PASIF("Pasif");

    private final String durum;

    EnumAP(String durum) {
        this.durum = durum;
    }

    @Override
    public String getDisplayName() {
        return this.durum;
    }

    public String getDurum() {
        return durum;
    }
}

package com.mehmetnuri.kursyonetim.enums;

public enum EnumKursDurumu implements BaseEnum{
    IPTAL("İptal"),
    PLANLANDI("Planlandı"),
    ONAYLANDI("Onaylandı"),
    TAMAMLANDI("Tamamlandı");


    private final String durum;

    EnumKursDurumu(String durum) {
        this.durum = durum;
    }

    public String getDurum() {
        return durum;
    }

    @Override
    public String getDisplayName() {
        return this.durum;
    }

    @Override
    public String toString() {
        return this.durum;
    }
}

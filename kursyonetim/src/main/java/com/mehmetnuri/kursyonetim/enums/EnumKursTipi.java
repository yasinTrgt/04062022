package com.mehmetnuri.kursyonetim.enums;

public enum EnumKursTipi implements BaseEnum{
    KATILIM_BELGELI("Katılım Belgeli"),
    MEB_ONAYLI("Meb Onaylı"),
    BASARI_SERTIFIKALI("Başarı Serifikalı");

    private final String kursTipi;

    EnumKursTipi(String kursTipi) {
        this.kursTipi = kursTipi;
    }

    @Override
    public String getDisplayName() {
        return kursTipi;
    }

    public String getKursTipi() {
        return kursTipi;
    }
}

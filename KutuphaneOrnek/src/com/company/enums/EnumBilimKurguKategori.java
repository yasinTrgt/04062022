package com.company.enums;

public enum EnumBilimKurguKategori {
    UZAY("Uzay"),
    GELECEK("Gelecek"),
    TARIH("Tarih"),
    YASANMISLIK("Yaşanmışlık");

    private String kategori;

    EnumBilimKurguKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
}

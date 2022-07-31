package com.mehmetnuri.kapbul.dto;

import com.mehmetnuri.kapbul.enums.EnumDurumAP;
import com.mehmetnuri.kapbul.enums.EnumKapDurumu;
import com.mehmetnuri.kapbul.enums.EnumKapTuru;


public class KapDto {

    private Long id;
    private String kapAdi;
    private EnumKapDurumu kapDurumu;
    private EnumKapTuru turu;
    private EnumDurumAP durum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKapAdi() {
        return kapAdi;
    }

    public void setKapAdi(String kapAdi) {
        this.kapAdi = kapAdi;
    }

    public EnumKapDurumu getKapDurumu() {
        return kapDurumu;
    }

    public void setKapDurumu(EnumKapDurumu kapDurumu) {
        this.kapDurumu = kapDurumu;
    }

    public EnumKapTuru getTuru() {
        return turu;
    }

    public void setTuru(EnumKapTuru turu) {
        this.turu = turu;
    }

    public EnumDurumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumDurumAP durum) {
        this.durum = durum;
    }
}

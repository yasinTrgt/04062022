package com.mehmetnuri.kapbul.entity;

import com.mehmetnuri.kapbul.enums.EnumDurumAP;
import com.mehmetnuri.kapbul.enums.EnumKapDurumu;
import com.mehmetnuri.kapbul.enums.EnumKapMateryalTuru;
import com.mehmetnuri.kapbul.enums.EnumKapTuru;

import javax.persistence.*;

@Entity
@Table(name = "kaplar")
public class Kap extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kap_adi")
    private String kapAdi;

    @Enumerated(EnumType.STRING)
    private EnumKapDurumu kapDurumu;

    @Enumerated(EnumType.STRING)
    private EnumKapMateryalTuru materyalTuru;

    @Enumerated(EnumType.STRING)
    private EnumKapTuru turu;

    @Enumerated(EnumType.STRING)
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

    public EnumKapMateryalTuru getMateryalTuru() {
        return materyalTuru;
    }

    public void setMateryalTuru(EnumKapMateryalTuru materyalTuru) {
        this.materyalTuru = materyalTuru;
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

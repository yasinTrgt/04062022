package com.company;

import com.company.enums.EnumBilimKurguKategori;
import com.company.enums.EnumKitapDurumu;

public class BilimKurgu extends Kitap implements IKitap{

    private EnumBilimKurguKategori kategori;
    private  boolean posterHediyesiVar;
    private String uyeNo;
    private double cezaiIslemUcreti;

    public BilimKurgu() {
    }


    @Override
    public double cezaiUcretHesapla() {

        if (super.getCezaGunSayisi() > 0) {
            return getCezaiIslemUcreti() * super.getCezaGunSayisi();
        }

        return 0;
    }

    @Override
    public boolean kiralanaBilir() {
        return EnumKitapDurumu.MEVCUT.equals(super.getDurumu());
    }

    @Override
    public boolean satinAlinabilir() {
        return EnumKitapDurumu.MEVCUT.equals(super.getDurumu());
    }

    @Override
    public boolean iadeEdilebilir() {

        return EnumKitapDurumu.KIRALAMADA.equals(super.getDurumu());
    }

    @Override
    public boolean teminEdilebilir() {
        return EnumKitapDurumu.TEMIN_EDILECEK.equals(super.getDurumu());
    }

    public EnumBilimKurguKategori getKategori() {
        return kategori;
    }

    public void setKategori(EnumBilimKurguKategori kategori) {
        this.kategori = kategori;
    }

    public boolean isPosterHediyesiVar() {
        return posterHediyesiVar;
    }

    public void setPosterHediyesiVar(boolean posterHediyesiVar) {
        this.posterHediyesiVar = posterHediyesiVar;
    }

    public String getUyeNo() {
        return uyeNo;
    }

    public void setUyeNo(String uyeNo) {
        this.uyeNo = uyeNo;
    }

    public double getCezaiIslemUcreti() {
        return cezaiIslemUcreti;
    }

    public void setCezaiIslemUcreti(double cezaiIslemUcreti) {
        this.cezaiIslemUcreti = cezaiIslemUcreti;
    }
}

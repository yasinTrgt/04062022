package com.company;

import com.company.enums.EnumBilimKurguKategori;
import com.company.enums.EnumKitapDurumu;
import com.company.enums.EnumKitapTuru;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BilimKurgu gelecegeDonus = new BilimKurgu();
        gelecegeDonus.setKitapAdi("Geleğe Dönüş");
        gelecegeDonus.setKategori(EnumBilimKurguKategori.GELECEK);
        gelecegeDonus.setPosterHediyesiVar(true);
        gelecegeDonus.setBasimEvi("XX Basım Evi");
        gelecegeDonus.setBasimYili(2013);
        gelecegeDonus.setDurumu(EnumKitapDurumu.KIRALAMADA);
        gelecegeDonus.setGunlukKirasi(0.03);
        gelecegeDonus.setSayfaSayisi(2500);
        gelecegeDonus.setTuru(EnumKitapTuru.BILIM_KURGU);
        gelecegeDonus.setYazar("XX Malcom XX");
        gelecegeDonus.setUyeNo("20");
        gelecegeDonus.setCezaiIslemUcreti(1);
        gelecegeDonus.setCezaGunSayisi(2);

        double ceza = gelecegeDonus.cezaiUcretHesapla();
        System.out.println(ceza);
        System.out.println(gelecegeDonus.satinAlinabilir());
        System.out.println(gelecegeDonus.teminEdilebilir());
        System.out.println(gelecegeDonus.iadeEdilebilir());
        System.out.println(gelecegeDonus.kiralanaBilir());

    }
}

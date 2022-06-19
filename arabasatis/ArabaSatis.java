package com.mehmetnuri.arabasatis;


import com.mehmetnuri.arabasatis.araba.Araba;
import com.mehmetnuri.arabasatis.islem.KrediIslem;

import java.text.DecimalFormat;

public class ArabaSatis {

    public static void main(String[] args) {

        Araba opel = new Araba();
        opel.setMarka("Opel");
        opel.setMaksimumHiz(160L);
        opel.setFiyat(350000.00);
        opel.setKapiSayisi(5L);
        opel.setVitesTipi("Otomatik");
        opel.setYakitCinsi("Dizel");
        opel.setRengi("Turuncu");
        opel.setModel("Corsa");


        Araba bmw = new Araba("BMW", "Siyah", 5L, "Benzin", "i5", 290L, 500000.00, "Manuel");


//        System.out.println(bmw);
//
//        List<Araba> arabaList = new ArrayList<>();
//        arabaList.add(opel);
//        arabaList.add(bmw);
//
//
//        System.out.println("Aşağıdaki arabaları satın alabilirsiniz");
//        for (Araba araba : arabaList) {
//            System.out.println(araba);
//        }


        KrediIslem bmwFaiz = new KrediIslem();
        bmwFaiz.setAnaPara(bmw.getFiyat());
        bmwFaiz.setFaizOrani(15.00);
        bmwFaiz.setTaksit(12L);

        Double faiz = bmwFaiz.faizHesapla();
        Double aylikTaksitTutari = (bmw.getFiyat() + faiz) / bmwFaiz.getTaksit();
        DecimalFormat df=new DecimalFormat("0,000.00");
        String formate = df.format(aylikTaksitTutari);


        System.out.println("Aylık ödenmesi gereken ücret " + formate);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        Phone pocoX3Nfc = new Phone();
        pocoX3Nfc.setBatteryCapacity(5000L);
        pocoX3Nfc.setCameraStatus(true);
        pocoX3Nfc.setColor("Blue");
        pocoX3Nfc.setCpuCoreSize(6);
        pocoX3Nfc.setFiveGStatus(false);
        pocoX3Nfc.setHardDriveCapacity(128L);
        pocoX3Nfc.setPrice(80000.00);
        pocoX3Nfc.setModel("X3 NFC 2019");

        System.out.println(pocoX3Nfc);


        Phone iPhone13ProMax = new Phone("13 Pro Max", 40000.00, true);
        iPhone13ProMax.setColor("Black");
        iPhone13ProMax.setCameraStatus(true);
        iPhone13ProMax.setCpuCoreSize(8);
        iPhone13ProMax.setHardDriveCapacity(1024L);
        iPhone13ProMax.setBatteryCapacity(6000L);

        System.out.println(iPhone13ProMax);


        Buzdolabi arcelikXXX = new Buzdolabi(2022, "Axaj", "ARÇELİK", 4,50000, true);
        arcelikXXX.setUretimYili(2021);
        System.out.println(arcelikXXX);


        Hayvan kedi = new Hayvan();
        kedi.setAyakSayisi(4);
        kedi.setBeslenmeSekli("Etçil");
        kedi.setCinsi("Tekir");
        kedi.setCinsiyet(true);
        kedi.setTuyDurumu(true);
        kedi.setDeriRengi("Karışık");
        kedi.setSes("Miav");
        kedi.setYas(2);
        kedi.setKanatDurumu(false);


        System.out.println(kedi);

        Hayvan kopek = new Hayvan(1,false,"Doberman",4,"Hav hav","Siyah",true,false,"Etçil");
        System.out.println(kopek);
    }
}

package com.company;

import com.company.abcsirketi.Hizmetli;
import com.company.abcsirketi.Mudur;
import com.company.ders.Fizik;
import com.company.hayvan.Kedi;
import com.company.sirket.Muhendis;
import com.company.supermarket.SuperMarketHesaplayici;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Kedi mila = new Kedi();
//        mila.hayvanSesiCikar();
//        mila.sesCikar("Miav Miav");
//
//
//        Fizik fizik = new Fizik();
//        fizik.setSinifNo(1);
//        fizik.setAd("Fizik");
//
//        System.out.println(fizik.getAdi());

//
//        SuperMarketHesaplayici superMarketHesaplayici = new SuperMarketHesaplayici();
//
//        Scanner scanner = new Scanner(System.in);
//
//        int domatesKilosu = scanner.nextInt();
//
//        double domatesUcreti = superMarketHesaplayici.domatesHesapla(domatesKilosu);
//        System.out.println("Domates toplam ücret "+ domatesUcreti);
//
//
//        Muhendis mehmet = new Muhendis();
//        mehmet.setAd("Mehmet Nuri");
//        mehmet.setSoyad("Öztürk");
//        mehmet.setDepartman("ABC DEP.");
//        mehmet.setAskerlikDurumu(false);
//        mehmet.setCepNumarasi("555");
//        mehmet.setMaas(28555.50);
//        mehmet.setUnvan("Sn");
//        mehmet.setServisKullanimDurumu(false);
//        mehmet.setIseGirisTarihi("10.10.2000");
//        mehmet.setPuantaj(8.0);
//        mehmet.setBilgisayariVarMi(true);
//        mehmet.setYas(29);
//
//        String adi = mehmet.getAdi();
//        System.out.println(adi);
//
//        System.out.println(mehmet);
//
//        System.out.println(mehmet.aracKullanabilir());
//        System.out.println(mehmet.bilgisayarKullanabilir());
//
//        if (mehmet.bilgisayarKullanabilir()) {
//            System.out.println("Mehmet' e laptop verilecek");
//        }else{
//            System.out.println("Mehmet' e laptop verilmeyecek");
//        }


        Mudur mudur = new Mudur();

        mudur.setAdSoyad("Kerim Ulu");
        mudur.setMaas(8600);
        mudur.setUnvan("Müdür");
        mudur.setEkGosterge(18500);
        mudur.setYasi(55);

        double mudurMaasi = mudur.MaaasHesapla();
        System.out.println(mudurMaasi);

        Hizmetli hizmetli = new Hizmetli();
        hizmetli.setAdSoyad("Hakan Can");
        hizmetli.setMaas(5000);
        hizmetli.setBirimi("Kazan Dairesi");
        hizmetli.setYasi(30);

        double hizmetliMaasi = hizmetli.MaaasHesapla();

        System.out.println(hizmetliMaasi);


    }
}

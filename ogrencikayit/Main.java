package com.company.ogrencikayit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);
        List<Ogrenci> ogrenciList = new ArrayList<>();


        Ogrenci mehmet = new Ogrenci();
        mehmet.setSinif("2");
        mehmet.setUniversite("Bla bla uni");
        mehmet.setFakulte("Abc Fak");
        mehmet.setNumara(123L);
        mehmet.setAd("Mehmet");
        mehmet.setSoyad("Öztürk");
        mehmet.setBolum("Bil.Müh.");

        ogrenciList.add(mehmet);

        System.out.println("Öğrenci Eklemek için 1, Listelemek İçin 2,Çıkmak İçin 3 ü seçiniz:");

        String secenek = scanner.nextLine();

        switch (secenek) {

            case "1":
                Scanner bilgi = new Scanner(System.in);
                Ogrenci ogrenci = new Ogrenci();




                System.out.println("Öğrenci Ad");
                ogrenci.setAd(bilgi.nextLine());

                System.out.println("Öğrenci Soyad: ");
                ogrenci.setSoyad(bilgi.nextLine());


                System.out.println("Öğrenci Üniversite Ad");
                ogrenci.setUniversite(bilgi.nextLine());


                System.out.println("Öğrenci Fakülte Ad");
                ogrenci.setFakulte(bilgi.nextLine());

                System.out.println("Öğrenci Bölüm Ad");
                ogrenci.setBolum(bilgi.nextLine());

                System.out.println("Öğrenci Sınıf Ad");
                ogrenci.setSinif(bilgi.nextLine());

                System.out.println("Öğrenci No");
                ogrenci.setNumara(bilgi.nextLong());

                ogrenciList.add(ogrenci);
                System.out.println(ogrenci);
                break;

            case "2":
                for (Ogrenci ogrenci1 : ogrenciList) {
                    System.out.println(ogrenci1);
                }
                break;

            case  "3":
                break;


        }


    }
}

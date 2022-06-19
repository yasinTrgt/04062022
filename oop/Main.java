package com.mehmetnuri.oop;

public class Main {

    public static void main(String[] args) {

//        Araba volvo = new Araba();
//        volvo.marka = "Volvo";
//        volvo.renk = "Siyah";
//
//        System.out.println(volvo.marka);

//        Ogrenci ahmet = new Ogrenci();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Öğrenci Ad:");
//        ahmet.ad = scanner.nextLine();
//
//        System.out.println("Öğrenci Soyad");
//        ahmet.soyad = scanner.nextLine();
//
//        System.out.println("Öğrenci No");
//        ahmet.ogrenciNo = scanner.nextLong();
//
//        System.out.println("Kayıtlı Olduğu Fakülte");
//        ahmet.fakulte = scanner.nextLine();
//
//        System.out.println("Bölümü");
//        ahmet.bolum = scanner.nextLine();
//
//        System.out.println("Burslu Mu?");
//        ahmet.burs = scanner.nextBoolean();
//
//        System.out.println("Sınıfı");
//        ahmet.sinif = scanner.nextLong();


//        Ogrenci mehmet = new Ogrenci();
//        System.out.println("Öğrenci Ad:");
//        mehmet.ad = scanner.nextLine();
//
//        System.out.println("Öğrenci Soyad");
//        mehmet.soyad = scanner.nextLine();
//
//        System.out.println("Öğrenci No");
//        mehmet.ogrenciNo = scanner.nextLong();
//
//        System.out.println("Kayıtlı Olduğu Fakülte");
//        mehmet.fakulte = scanner.nextLine();
//
//        System.out.println("Bölümü");
//        mehmet.bolum = scanner.nextLine();
//
//        System.out.println("Burslu Mu?");
//        mehmet.burs = scanner.nextBoolean();
//
//
//        System.out.println("Sınıfı");
//        mehmet.sinif = scanner.nextLong();
//
//        System.out.println(ahmet.ad);
//        System.out.println(mehmet.ad);
//        ahmet.oku();
//        mehmet.oku();

//        Islemler hesap1 = new Islemler();
//        int carp = hesap1.carp(3, 3);
//        System.out.println(carp);

        Araba ford = new Araba();
        ford.setMarka("Ford");
        ford.markagetir();
        ford.setFiyat(150000);
        int tasitSayisi = 12;

        double aylikTaksit = ford.aylikTaksit( tasitSayisi);

        System.out.println(ford.getFiyat() + " için "+ tasitSayisi + " için aylık ödemeniz gereken ücret " +  aylikTaksit);


        Araba audi = new Araba("Kırmızı","Audi",300000);



        aylikTaksit = audi.aylikTaksit( tasitSayisi);

        System.out.println(audi.getFiyat() + " için "+ tasitSayisi + " için aylık ödemeniz gereken ücret " +  aylikTaksit);
    }
}

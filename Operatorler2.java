package com.company;

public class Operatorler2 {

    public static void main(String[] args) {

        /*
        İlişkisel Operatorler

        <, >, <=, >= , ==, !=
         */

        //boolean  true false

        int a = 10;
        int b = 20;
        boolean abdenbuyumu;
        boolean abedenkucukmu;
        boolean abdenkucukveyaesitmi;
        boolean abdenbuyukveyaesitmi;
        boolean abyeesitmi;
        boolean abyeesitdegilmi;

        // Büyükmü
        abdenbuyumu = a > b;
        System.out.println("Büyüklük Kontrolü");
        System.out.println(abdenbuyumu);
        System.out.println(a > b);

        // Küçük mü
        abedenkucukmu = a < b;
        System.out.println("Küçüklük Kontrolü");
        System.out.println(abedenkucukmu);
        System.out.println(a < b);

        // Küçük veya Eşit
        abdenkucukveyaesitmi = a <= b;
        System.out.println("Küçük veya Eşit Kontrolü");
        System.out.println(abdenkucukveyaesitmi);
        System.out.println(a <= b);

        //Büyük veya Eşit
        abdenbuyukveyaesitmi = a >= b;
        System.out.println("Büyük veya Eşit Kontrolü");
        System.out.println(abdenbuyukveyaesitmi);
        System.out.println(a >= b);

        //Eşit mi
        abyeesitmi = a == b;
        System.out.println("Eşitlik Kontrolü");
        System.out.println(abyeesitmi);
        System.out.println(a == b);

        //Eşit Değil mi
        abyeesitdegilmi = a != b;
        System.out.println("Eşit Değil Kontrolü");
        System.out.println(abyeesitdegilmi);
        System.out.println(a != b);

        /**
         * Mantıksal Operatörler
         *
         * && ve || veya  ! NOT (Değil)
         */

        int c = 40;
        int d = 40;
        boolean esitVeyaKucukKontrolu;
        boolean esitVeYuzdenBuyuk;

        esitVeyaKucukKontrolu = c == d || c > 10;
        esitVeYuzdenBuyuk = c == d && c > 100;

        System.out.println("Ve Veya Kontrolü");
        System.out.println(esitVeyaKucukKontrolu);
        System.out.println(esitVeYuzdenBuyuk);

        System.out.println( !(10==10) );


    }
}

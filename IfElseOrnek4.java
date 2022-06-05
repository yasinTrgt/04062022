package com.company;

import java.util.Scanner;

public class IfElseOrnek4 {

    /**
     * .Öğrenciden vize ve final notu istenerek, öğrencinin not ortalamasının hangi harf aralığında olduğunu ve
     * geçme kalma durumunu hesaplayan program
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vizeNotu, finalNotu;
        double ortalama;

        System.out.println("Lütfen vize notunuzu giriniz:");
        vizeNotu = scanner.nextInt();

        System.out.println("Lütfen final notunuzu giriniz:");
        finalNotu = scanner.nextInt();

        ortalama = (vizeNotu * 0.3) + (finalNotu * 0.7);
        System.out.println("Ortalamanız: " + ortalama);


        if (ortalama >= 88 && ortalama <= 100) {
            System.out.println("Harf Notunuz: AA");
        } else if (ortalama >= 80 && ortalama <= 87.9) {
            System.out.println("Harf Notunuz: BA");
        } else if (ortalama >= 73 && ortalama <= 79.9) {
            System.out.println("Harf Notunuz: BB");
        } else if (ortalama >= 66 && ortalama <= 72.9) {
            System.out.println("Harf Notunuz: CB");
        } else if (ortalama >= 60 && ortalama <= 65.9) {
            System.out.println("Harf Notunuz: CC");
        } else if (ortalama >= 55 && ortalama <= 59.9) {
            System.out.println("Harf Notunuz: DC");
        } else if (ortalama >= 50 && ortalama <= 54.9) {
            System.out.println("Harf Notunuz: DD");
        } else if (ortalama >= 0 && ortalama <= 49.9) {
            System.out.println("Harf Notunuz: FF");
        }

    }
}

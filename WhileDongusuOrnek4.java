package com.company;

import java.util.Scanner;

public class WhileDongusuOrnek4 {

    /**
     * Girilen sayının kaç basamaklı olduğunu bulan program.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamak = 1;

        while (sayi >= 10) {
            sayi /= 10;
            basamak++;
        }

        System.out.println("Girilen sayının basamak sayısı" + basamak);





    }
}

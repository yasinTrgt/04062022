package com.company;

import java.util.Scanner;

public class DoWhileOrnek1 {

    public static void main(String[] args) {

        //Girilen sayının basamaklarının toplamını yazan program

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");

        int sayi = sc.nextInt();
        int toplam = 0;

        do {
            toplam += sayi % 10;
            sayi /= 10;

        } while (sayi > 0);

        System.out.println("Girilen sayıların basamaklarının toplamı: " + toplam);
    }
}

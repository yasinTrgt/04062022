package com.company;

import java.util.Scanner;

public class DoWhileOrnek2 {

    public static void main(String[] args) {

        //do while döngüsüyle girilen sayıdan 0’a kadar olan sayılarının toplamını yazan program.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");

        int sayi = sc.nextInt();
        int toplam = 0;

        do {

            toplam += sayi;
            sayi--;

        } while (sayi > 0);

        System.out.println(toplam);

    }
}

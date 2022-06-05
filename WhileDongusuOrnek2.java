package com.company;

import java.util.Scanner;

public class WhileDongusuOrnek2 {

    /**
     * While döngüsü ile klavyeden girilen sayıdan 0’a kadar olan sayıların
     * toplamını hesaplayan program.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        while (0 < sayi) {
            toplam += sayi;
            sayi--;
        }

        System.out.println(toplam);


    }
}

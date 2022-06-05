package com.company;

import java.util.Scanner;

public class WhileDongusuOrnek3 {

    /**
     * While döngüsü ile sayının faktöriyelini hesaplama programı.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        long faktoryel = 1l;

        if (sayi == 0) {
            System.out.println("0 'ın faktöryeli olmadığından sayı otomatik olarak 1 e eşitlendi");
            sayi = 1;
        }

        while (sayi > 0) {
            faktoryel *= sayi;
            System.out.println(sayi);
            sayi--;

        }

        System.out.println("Girdiniz sayının faktöryeli: " + faktoryel);



    }
}

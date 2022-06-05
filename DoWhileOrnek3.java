package com.company;

import java.util.Random;
import java.util.Scanner;

public class DoWhileOrnek3 {

    public static void main(String[] args) {

        Random r = new Random();

        int sayi = r.nextInt(50);
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütefen tahmininizi giriniz: ");

        do {
            n = scanner.nextInt();
            if (n > sayi) {
                System.out.println("Tahmin edilen sayıdan büyük girdiniz. Lütfen küçük bir sayı girin");
            } else if (n < sayi) {
                System.out.println("Tahmin edilen sayıdan küçük girdiniz. Lütfen büyük bir sayı girin");
            }else{
                System.out.println("Tebrikler");
                break;
            }

        } while (true);


    }
}

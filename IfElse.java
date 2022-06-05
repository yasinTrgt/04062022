package com.company;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        System.out.println("Lütfen birinci sayıyı girin: ");
        Scanner scanner = new Scanner(System.in);
        int birinciSayi = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int ikinciSayi = scanner.nextInt();


        /**
         *  if(koşul){
         *      işlemler
         *  }else{
         *      işlemler
         *  }
         */

        if (birinciSayi > ikinciSayi) {
            System.out.println("Birinci sayı, ikinci sayıdan büyüktür");
        } else if (birinciSayi == ikinciSayi) {
            System.out.println("Birinci sayı, ikinci sayıya eşit");
        } else {
            System.out.println("İkinci sayı, birinci sayıdan büyük");
        }

        int a = 5;



    }
}

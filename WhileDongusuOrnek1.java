package com.company;

import java.util.Scanner;

public class WhileDongusuOrnek1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        while (0 < sayi) {
            System.out.println(sayi);
            sayi -= 2;
        }

    }
}

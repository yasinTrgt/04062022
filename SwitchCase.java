package com.company;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ay sırasını giriniz(1-12): ");

        int ay = scanner.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;

            default:
                System.out.println("Yanlış bir ay sırası girdiniz !!!");
                break;

        }



    }
}

package com.company;

import java.util.Scanner;

public class IfElseOrnek3 {

    /**
     * Beden kitle indeksini hesaplayan ve hangi kilo alanında olduğunu söyleyen program.
     */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double boy, kilo, endex;

        System.out.println("Lütfen boyunuzu giriniz:");
        boy = scanner.nextDouble()/100;

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        // boy / (kilo*kilo)

        endex = kilo / (boy * boy);

        if (endex < 18.5) {
            System.out.println("Zayıfsınız! ");
        } else if (endex >= 18.5 && endex <= 24.9) {
            System.out.println("Normal");
        } else if (endex >= 25 && endex <= 29.9) {
            System.out.println("Şişiman");
        }else{
            System.out.println("OBEZ !!!");
        }

    }
}

package com.company;

import java.util.Scanner;

public class IfElseOrnek2 {

    /**
     * Koşul içerisinde kullandığımız değerleri kendimiz vermek yerine, kullanıcıdan da isteyebiliriz.
     * Bunun için (Scanner)
     * sınıfını kullanmamız gerekmektedir. Girilen yaşa göre, eğlence merkezine girip giremeyeceğini belirten program.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. NOTUNUZU giriniz:");
        int birinciNot = scanner.nextInt();

        System.out.println("Lütfen 2. NOTUNUZU giriniz:");
        int ikinciNot = scanner.nextInt();

        System.out.println("Lütfen 3. NOTUNUZU giriniz:");
        int ucuncuNot = scanner.nextInt();


        double ortalama = (birinciNot + ikinciNot + ucuncuNot) / 3;

        System.out.println("Ortalamanız : " + ortalama + " !");

        /**
         *
         * ortalama  70-80 iyi
         * 80 > pekiyi
         * 60-70 orta
         * 0-45  KÖTÜ
         */

        if (ortalama <= 45) {
            System.out.println("Not ortalamanız kötü");
        } else if (ortalama > 45 && ortalama <= 70) {
            System.out.println("Not ortalamanız orta");
        } else{
            System.out.println("Not ortalamanız pekiyi");
        }


    }
}

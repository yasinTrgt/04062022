package com.company;

import java.util.Scanner;

public class IfElseOrnek1 {

    /**
     * Koşul içerisinde kullandığımız değerleri kendimiz vermek yerine, kullanıcıdan da isteyebiliriz.
     * Bunun için (Scanner)
     * sınıfını kullanmamız gerekmektedir. Girilen yaşa göre, eğlence merkezine girip giremeyeceğini belirten program.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas = scanner.nextInt();


        if (yas >= 18 && yas < 60) {
            System.out.println("Eğlence merkezine girebilirsiniz....");
        } else if (yas >= 60 && yas < 70) {
            System.out.println("60-70 yai aralığı giremez");
        } else {
            System.out.println("Eğlenece merkezine giremezsiniz!!!");
        }


    }
}

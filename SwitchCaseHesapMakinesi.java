package com.company;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y;


        String secenekler = "Toplama İşlemi İçin 1\n" +
                "Çıkarma İşlemi İçin 2\n" +
                "Çarpma İşlemi İçin 3\n" +
                "Bölme İşlemi İçin 4 'ü seçiniz ";

        System.out.println(secenekler);


        System.out.println("Lütfen işlem seçiniz: ");

        String islem = scanner.nextLine();

        switch (islem) {

            case  "1":
                System.out.println("Birinci Sayıyı Gir: ");
                x = scanner.nextInt();
                System.out.println("İkinci Sayıyı Gir: ");
                y = scanner.nextInt();
                System.out.println("Sayılarınızın Toplamı : " + islem(x,y, "+"));
                break;

            case "2":
                System.out.println("Birinci Sayıyı Gir: ");
                x = scanner.nextInt();
                System.out.println("İkinci Sayıyı Gir: ");
                y = scanner.nextInt();
                System.out.println("Sayılarınızın Farkı : " + islem(x,y, "-"));
                break;

            case "3":
                System.out.println("Birinci Sayıyı Gir: ");
                x = scanner.nextInt();
                System.out.println("İkinci Sayıyı Gir: ");
                y = scanner.nextInt();
                System.out.println("Sayılarınızın Farkı : " + islem(x,y, "*"));
                break;

            case "4":
                System.out.println("Birinci Sayıyı Gir: ");
                x = scanner.nextInt();
                System.out.println("İkinci Sayıyı Gir: ");
                y = scanner.nextInt();
                System.out.println("Sayılarınızın Farkı : " + islem(x,y, "/"));
                break;

            default:
                System.out.println("Hatalı Seçim");
                break;
        }
    }

    public static int islem(int x, int y, String islem) {

        int sonuc;
        switch (islem) {
            case "+":
                sonuc = x + y;
                break;
            case "-":
                sonuc = x - y;
                break;
            case "*":
                sonuc = x * y;
                break;
            case "/":
                sonuc = x / y;
                break;
            default:
                sonuc = 0;
                break;
        }

        return sonuc;
    }




}

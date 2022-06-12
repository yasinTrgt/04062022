import java.util.Scanner;

public class Metodlar2 {

    /**
     * Değer döndüren metotlar
     */

    public static void main(String[] args) {
        int sonuc = topla(1, 2);
        System.out.println("Sonuc: "+ sonuc);

        int carpim = carpim(1, 2, 3);
        System.out.println(carpim);

        int sonuc2 = sayiyaKadarCarp(5);
        System.out.println("10 a kadar carpım :" + sonuc2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen faktöryeli hesaplanacak sayıyı girin:");
        int sayi = scanner.nextInt();

        int faktoryel = faktoryelHesapla(sayi);
        System.out.println(faktoryel);

    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int carpim(int a, int b, int c) {
        return a * b * c;
    }

    public static int sayiyaKadarCarp(int sayi) {

        int carp = 1;

        for (int i = 1; i < (sayi+1); i++) {
            carp *= i;
        }
        return carp;
    }

    public static int faktoryelHesapla(int sayi) {
        int sonuc = 1;
        sonuc = sayiyaKadarCarp(sayi);
        return sonuc;
    }


}

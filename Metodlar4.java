import java.util.Scanner;

public class Metodlar4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();

        int fibonacci = fibonacciSayisi(sayi);
        System.out.println("Fibonaccci Sayısı: "+ fibonacci);

        int sonuc = topla(sayi);
        System.out.println("Girlen sayıdan 1'e kadar olan sayıların toplamı: "+ sonuc);

    }

    /**
     * Recursive  (Öz Yenilemeli)
     * Kendi kendini çağıran metodlar
     */

    public static int topla(int a) {
        if (0 <= a) {
            return (a + topla(a - 1));
        } else {
            return 0;
        }
    }

    public static int fibonacciSayisi(int n) {

        if ((n == 0) || (n == 1)) {
            return n;
        }else{
            return fibonacciSayisi(n - 1) + fibonacciSayisi(n - 2);
        }
    }
}

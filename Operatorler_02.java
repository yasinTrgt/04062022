public class Operatorler_02 {

    public static void main(String[] args) {


        /**
         * camelCase Yöntemi
         * PascalCase Yöntemi
         * FULLCASE
         * SNAKE_CASE snake_case
         * kebab-case
         */


        // Aritmetik Operatörler
        int sayi1 = 5;
        int sayi2 = 10;
        int toplamaSonucu;
        int cikarmaSonucu;
        int carpmaSonucu;
        int bolmeSonucu;
        int modSonucu;

        // Toplama İşlemi (+)
        toplamaSonucu = sayi1 + sayi2;
        System.out.println(toplamaSonucu);

        // Çıkarma İşleleri (-)
        cikarmaSonucu = sayi1 - sayi2;
        System.out.println(cikarmaSonucu);

        //Çarpma  İşlemi(*)
        carpmaSonucu = sayi1 * sayi2;
        System.out.println(carpmaSonucu);

        // Bölme İşlemi (/)
        bolmeSonucu = sayi2 / sayi1;
        System.out.println(bolmeSonucu);

        // Mod alma (%)
        modSonucu = sayi2 % sayi1;
        System.out.println(modSonucu);


        // Tek Satır Yorum

        /*
        Çoklu
        Satır Yorum
         */


        /**
         * Tekli Operatörler
         */

        int sayac1 = 3;
        int sayac2 = 5;
        sayac1++;
        --sayac2;

        System.out.println(sayac1);
        System.out.println(sayac2);

        /**
         * += , *=, /=, -= Operatorleri
         */

        int numara1 = 140;
        int numara2 = 250;

        numara1 += 20;
        numara2 *= 2;
        System.out.println(numara1);
        System.out.println(numara2);

        numara1 /= 2;
        numara2 -=20;
        System.out.println(numara1);
        System.out.println(numara2);
    }
}

import java.util.Arrays;
import java.util.Collections;

public class Dizier_Islemler {


    public static void main(String[] args) {


//        /**
//         * Kopyalama İşlemi
//         */
//        String a[] = {"Minnoş", "Karabaş", "Karagöz", "Tüylü", "Pamuk"};
//
//        String b[] = new String[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] =  a[i];
//        }
//
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
//
//        /**
//         * Sıralama işlemi
//         */
//
//        int sayilar[] = {9, 4, 3, 6, 5, 7};
//        Arrays.sort(sayilar);
//        for (int i = 0; i < sayilar.length; i++) {
//            System.out.println(sayilar[i]);
//        }


        /**
         * Karşılaştırma İşlemi
         */

//        int sayilar1[] = {9, 4, 3, 6, 5, 7};
//        int sayilar2[] = {9, 4, 3, 6, 5, 7};
//        int sayilar3[] = {12, 4, 3, 6, 5, 7};
//        System.out.println(sayilar1.equals(sayilar2)); //Adrese göre kontrol sağlar
//        System.out.println(Arrays.equals(sayilar1,sayilar2)); //True
//        System.out.println(Arrays.equals(sayilar1,sayilar3)); //False
//
//
//        Object[] ogrenci1 = {1453,"Sülü", "25"};
//        Object[] ogrenci2 = {1453,"Sülü", "25"};
//        Object[] ogrenci3 = {1453,"Sülüs", "25"};
//
//        System.out.println(Arrays.equals(ogrenci1,ogrenci2)); //true
//        System.out.println(Arrays.equals(ogrenci1,ogrenci3)); //false

        int sayilar1[] = {9, 4, 3, 6, 5, 7};
        int arama = Arrays.binarySearch(sayilar1, 9);
        System.out.println(arama);

        int intArr[] = { 10, 20, 15, 22, 35 };

        int ara = Arrays.binarySearch(intArr, 10);
        System.out.println(ara);

    }
}

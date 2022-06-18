import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiziSinifMetodlari {


    public static void main(String[] args) {


        //Arrays.asList Metodu
//
//
//        String array[] = {"Mehmet Nuri", "Öztürk"};
//
//        int array1[] = {1, 2};
//
//        List liste1 = new ArrayList();
//        liste1 = Arrays.asList(array);
//
//        System.out.println(liste1.get(0));
//
//        for (Object o : liste1) {
//            System.out.println(o);
//        }
//
//        List<String> listem = new ArrayList<>();
//
//        listem.add("Mehmet Nuri");
//        listem.add("Osman");
//        listem.add("Pamuk");
//
//        for (int i = 0; i < listem.size(); i++) {
//            System.out.println(listem.get(i));
//        }
//
//        for (String s : listem) {
//            System.out.println(s);
//        }


        /**
         * Arrays.CopyOf Metodu
         */

//        int[] a = new int[] {23,62,98,34,16,77,45};
//
//        System.out.println("Normal Çıktısı");
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//
//        int[] kopya = Arrays.copyOf(a, a.length);
//        System.out.println("Kopya Dizisi İçeriği");
//
//        for (int i = 0; i < kopya.length; i++) {
//            System.out.println(kopya[i]);
//        }
//
//        //Arrays.copyOfRange()
//
//        int[] kopya2 = Arrays.copyOfRange(a, 2, 6);
//        System.out.println("Kopya 2 nin içeriği");
//
//        for (int i = 0; i < kopya.length; i++) {
//            System.out.println(kopya2[i]);
//        }
//

        //Arrays.fill Metodu

        int b[] = {99, 99, 99, 99, 99, 99, 99, 99};

        Arrays.fill(b, 1,3,55);
        System.out.println(Arrays.toString(b));
    }
}

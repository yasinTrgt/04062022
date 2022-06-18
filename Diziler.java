public class Diziler {

    public static void main(String[] args) {


        int[] dizi1 ; // Boş dizi tanımlama

        int[] dizi2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(dizi2);
        System.out.println(dizi2[1]);

        String[] isimler = {"Ahmet", "Mehmet"};
        System.out.println(isimler[1]);

        String[] isimler2 = new String[2];
        isimler2[0] = "ALi";
        isimler2[1] = "Mehmet";

        System.out.println(isimler2[1]);

        for (int i = 0; i < dizi2.length; i++) {

            System.out.println(dizi2[i]);

        }

        for (int i = 0; i< isimler2.length; i++) {
            System.out.println(isimler2[i]);
        }


    }
}

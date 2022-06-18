public class Diziler_Object {


    public static void main(String[] args) {


        Object dizi[] = new Object[5];
        dizi[0] = "Osman Pamuk";
        dizi[1] = 1993;
        dizi[2] = false;
        dizi[3] = 22.5;
        dizi[4] = 'a';


        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

    }
}

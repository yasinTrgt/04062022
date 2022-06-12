public class Metodlar3 {

    public static void main(String[] args) {

        int topla = topla(1, 2);
        int topla1 = topla(1, 2, 3);
        int topla2 = topla(1, 2, 3, 4);

        System.out.println(topla);
        System.out.println(topla1);
        System.out.println(topla2);
    }

    /**
     * Ovverloading  (Aşırı Yüklenme)
     * Aynı isimde ayni tipte fakat parametre sayısı farklı olan metotlar
     */

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static int topla(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

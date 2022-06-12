public class Metodlar {

    public static void main(String[] args) {


        /**
         * erişim belirleyicisi   donuş tipi  metotadi(varsa parametre){
         *          yapacağı işlemler
         * }
         *
         */

        selamla();
        islem();

        String adim = "Mehmet";

        adimiYaz("Mehmet Nuri");
        adimiYaz(adim);
        adimiVeSoyadimiYaz("Mehmet Nuri", "Öztürk");
        topla(1,2,3);

        bilgilerimiYaz("Mehmet Nuri", "Öztürk", 1993, 1036144, "Muh.", 24.750);

    }


    public static void selamla() {
        System.out.println("Merhaba gençler !!!");
    }

    public static void islem() {
        System.out.println("Bölme  : " + 10 / 2);
        System.out.println("Çarpma  :" + 10 * 2);
    }

    public static void adimiYaz(String ad) {
        System.out.println("Merhaba : " + ad);
    }

    public static void adimiVeSoyadimiYaz(String ad, String soyad) {

        System.out.println("Merhaba " + ad + " " + soyad);
    }

    public static void topla(int a, int b, int c) {
        System.out.println("Toplam : " + (a+b+c));
    }

    public static void bilgilerimiYaz(String ad, String soyad, int dogumYili, int tc, String meslek, double maas) {

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+ soyad);
        System.out.println("Doğum Yılı: "+ dogumYili);
        System.out.println("TC: "+ tc);
        System.out.println("Meslek: "+ meslek);
        System.out.println("Maaş :" + maas);

    }



}

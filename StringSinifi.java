public class StringSinifi {

    public static void main(String[] args) {

        String tur1 = "Merhaba";
        String tur2 = "Java";
        String tur3 = "String";
        String tur4 = "Sınıfı";

        System.out.println(tur1);
        System.out.println(tur2);
        System.out.println(tur3);
        System.out.println(tur4);

        // lenght stringin uzunluğunu verir

        System.out.println(tur1.length());

        //charAt() string içindeki sıra numarası verilen karakteri döner
        System.out.println(tur1.charAt(0));

        //substring(indis numarasi baslangic, indis numarası bitis) String yapısını belli bir bölümünü seçer
        System.out.println(tur1.substring(0,5));

        //replace("değişecek karakter", "yeni karakter")
        System.out.println(tur1.replace("Mer", "Al"));

        //concat iki stringi birleştirir

        String s1 = "Mer";
        String s2 = "Haba";
        String birlesmisHali = s1.concat(s2);
        System.out.println(birlesmisHali);

        // indexOf() Stringin 0. indisinden gilen indis e kadar olan kısmını yazırır
        String st1 = "Merhaba bu gün hava çok bunaltıcı";
        System.out.println(st1.indexOf("a"));

        //lastIndexOf() aranılan karakterin son değerini verir
        System.out.println(st1.lastIndexOf("haba"));

        //equals stringleri karşılaştırmak için kullanılır
        String a1 = "Albama";
        String a2 = "albama";
        System.out.println(a1.equals(a2));

        //equalsIgnoreCase küçük büyük harf göz ardı edilir
        System.out.println(a1.equalsIgnoreCase(a2));




    }
}

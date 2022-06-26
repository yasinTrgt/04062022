package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        KrediTurleri arabaKredisi = new KrediTurleri();
//        arabaKredisi.setKrediTutari(10.00);
//        arabaKredisi.setFaizOrani(1.0);
//        arabaKredisi.setVadeFarkiVarMi(false);
//        arabaKredisi.setTaksitSayisi(5L);
//
//        System.out.println(arabaKredisi.odenecekTutar());
//
//        TarimKredisi bahceKredisi = new TarimKredisi();
//        bahceKredisi.setFaizOrani(0.2);
//        bahceKredisi.setKrediTutari(10.0);
//        bahceKredisi.setTaksitSayisi(15L);
//
//        System.out.println(bahceKredisi.odenecekTutar());


        Motorsiklet kawasaki = new Motorsiklet();
        kawasaki.setMarka("Kawasaki");
        kawasaki.setFiyat(120000.00);
        kawasaki.setModel("XR 36100");
        kawasaki.setRenk("Kırmızı");
        kawasaki.setEmisyonOrani(1.0);
        kawasaki.setMaximumHiz(300L);
        kawasaki.setZincirTipi("Çelik");
        kawasaki.setSeleTipi("Deri");


        Kamyon volvoX2 = new Kamyon();
        volvoX2.setMarka("VOLVO");
        volvoX2.setFiyat(1000000.00);
        volvoX2.setRenk("Beyaz");
        volvoX2.setModel("X2");
        volvoX2.setDingilSayisi(6L);
        volvoX2.setMaximumYukKapasitesi(30.0);
        volvoX2.setYatakDurumu(true);
        volvoX2.setAdBlueDurumu(true);

        volvoX2.ozellikYaz();

        Arac traktor = new Traktor();
        traktor.setFiyat(50000);
        traktor.setMarka("Ferguson");
        traktor.setModel("165");
        traktor.ozellikYaz();
    }
}

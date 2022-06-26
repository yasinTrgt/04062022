package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hesaplayici elma = new Hesaplayici();
        elma.setName("Süt");

        elma.setLitre(2);
        elma.setFiyat(3.0);

        double sutFiyati = elma.sutHesapla();
        System.out.println(elma.getName() + " ürünü " + elma.getLitre() + " litre için toplam " +sutFiyati + " ücretindedir");
    }
}

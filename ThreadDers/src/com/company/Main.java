package com.company;

public class Main {

    public static void main(String[] args) {

        uzunBirIslem();
        System.out.println("Merhaba Thread");
    }

    private static void uzunBirIslem() {

        try {


            Thread.sleep(5 * 1000);
            System.out.println("Uzun işlem sonucu");


        } catch (InterruptedException ex) {
        }

    }
}

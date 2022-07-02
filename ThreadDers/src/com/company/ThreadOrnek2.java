package com.company;

public class ThreadOrnek2 extends Thread{


    public static void main(String[] args) {
        ThreadOrnek2 threadOrnek2 = new ThreadOrnek2();

        threadOrnek2.start();
    }

    @Override
    public void run() {


        try {

            Thread.sleep(0);
            System.out.println("Uzun bir işlem sonucu");


        } catch (InterruptedException exception) {

        }

    }
}

package com.company;

public class ThreadOrnek3 implements Runnable{


    public static void main(String[] args) {


        Thread t1 = new Thread(new ThreadOrnek3());
        t1.start();
        System.out.println("Merhaba Thread");

    }

    @Override
    public void run() {
        try {
            Thread.sleep(0);
            System.out.println("Uzun bir işlem sonucu");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

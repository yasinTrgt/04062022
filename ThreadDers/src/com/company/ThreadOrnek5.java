package com.company;

public class ThreadOrnek5  implements Runnable{


    public static void main(String[] args) {
        /**
         *
         * ÖNEMLİ NOT
         *
         * Thread sadece main metodu içinde çalışır
         */

        Thread t1 = new Thread(new ThreadOrnek5());
        Thread t2 = new Thread(new ThreadOrnek5());

        t1.start();
        t2.start();

    }

    @Override
    public void run() {

        synchronized (ThreadOrnek5.class) {
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName());
            }

        }


    }
}

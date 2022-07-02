package com.company;

public class ThreadOrnek6 implements Runnable{


    public static void main(String[] args) {
        /**
         * Önemli Not
         * Thread e öncelik vermek sekronize şekilde çalışmasını
         * garanti etmez !!!
         */


        Thread t1 = new Thread(new ThreadOrnek6());
        Thread t2 = new Thread(new ThreadOrnek6());
        Thread t3 = new Thread(new ThreadOrnek6());


        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
        t3.start();


    }


    @Override
    public void run() {
        synchronized (ThreadOrnek6.class) {
            for (int i = 0; i < 100; i++) {

                System.out.println(Thread.currentThread().getName());
            }

        }
    }
}

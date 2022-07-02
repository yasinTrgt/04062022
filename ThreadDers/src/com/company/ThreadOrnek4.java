package com.company;

public class ThreadOrnek4 implements Runnable{


    int zaman;

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadOrnek4(3000));
        Thread t2 = new Thread(new ThreadOrnek4(6000));

        t1.start();
        t2.start();

    }

    public ThreadOrnek4(int zaman) {
        this.zaman = zaman;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(this.zaman);

            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

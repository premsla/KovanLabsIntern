package com.kovanLabs.intern;

class MyThread extends Thread {
    StringBuilder sb;

    MyThread(StringBuilder sb) {
        this.sb = sb;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
              sb.append(Thread.currentThread().getName() + "\n");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Stringbuffer {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        MyThread t1 = new MyThread(sb);
        MyThread t2 = new MyThread(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(sb);
        System.out.println();
    }
}

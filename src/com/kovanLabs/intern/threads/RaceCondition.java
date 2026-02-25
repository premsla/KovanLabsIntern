package com.kovanLabs.intern.threads;
class counter implements Runnable{
    int cnt=0;
    public synchronized void increment(){
        cnt++;
    }
    public void run(){
        for(int i=0;i<100;i++){
            increment();
        }
    }
}
public class RaceCondition {
    public static void main(String[] args)throws InterruptedException{
        counter obj=new counter();
        Thread[] threads=new Thread[10];
        for(int i=0;i<10;i++){
            threads[i]=new Thread(obj);
            threads[i].start();

        }
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        System.out.print(obj.cnt);


    }

}


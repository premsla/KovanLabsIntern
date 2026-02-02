package com.kovanLabs.intern.Singleton;

class ObjectCounter {
    private static int count = 0;
    public ObjectCounter() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}

public class MainCounter {
    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println("Total objects created: " + ObjectCounter.getCount());
    }
}

package com.kovanLabs.intern.Singleton;

import java.util.concurrent.atomic.AtomicInteger;

class ObjectCounter {
    private static final AtomicInteger count = new AtomicInteger(0);

    public ObjectCounter() {
        count.incrementAndGet();
    }

    public static int getCount() {
        return count.get();
    }
}
public class MainCounter {
    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println("Total objects created: " + ObjectCounter.getCount());
    }
}

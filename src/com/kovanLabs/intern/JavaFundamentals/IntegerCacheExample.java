package com.kovanLabs.intern.JavaFundamentals;
import java.util.*;
public class IntegerCacheExample {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=100;
        System.out.println("a==b "+(a==b));
        System.out.println("a.equals(b) "+a.equals(b));
        Integer x=200;
        Integer y=200;
        System.out.println("x==y "+(x==y));
        System.out.println("x.equals(y) "+ x.equals(y));
        Integer m = new Integer(100);
        Integer n = new Integer(100);
        System.out.println("m==n "+(m==n));
        System.out.println("m.equals(n) "+m.equals(n));
    }
}

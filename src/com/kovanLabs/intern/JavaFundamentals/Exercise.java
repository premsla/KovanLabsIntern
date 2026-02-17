package com.kovanLabs.intern.JavaFundamentals;

public class Exercise {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s3));
        byte b = 127;
        for (int i = 0; i < 5; i++) {
            b++;
            System.out.println(b);
        }
        Integer a = 10;
        Integer c = a;
        a = a + 1;
        System.out.println(a);
        System.out.println(c);

        int sum = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

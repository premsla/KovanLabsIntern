package com.kovanLabs.intern.ControlFlowAlgorithm;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int max=(a>b)?a:b;
        System.out.println(max);
        int num=7;
        String res=(num%2==0)?"Even":"odd";
        System.out.println(res);
    }
}

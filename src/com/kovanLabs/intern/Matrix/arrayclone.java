package com.kovanLabs.intern.Matrix;

public class arrayclone {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b=new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        b[1]=4;
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int[] x=a.clone();
        System.out.println("ArrayClone:");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

    }
}

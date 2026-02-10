package com.kovanLabs.intern.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysLinkedList {
    public static void main(String[] args) {
        int n = 1_000_000;
        int middleIndex = n / 2;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        long startArray=System.nanoTime();
        int val1=list.get(middleIndex);
        long endArray=System.nanoTime();
        long totaltime=endArray-startArray;
        System.out.println("Totaltime taken to get element in an array "+totaltime);
        LinkedList<Integer>list1=new LinkedList<>();
        for(int i=0;i<n;i++){
            list1.add(i);
        }
        long StartList=System.nanoTime();
        long Va12=list1.get(middleIndex);
        long endList=System.nanoTime();
        long totaltimelist=endList-StartList;
        System.out.println("Totaltime taken to get element in an LinkedList "+totaltimelist);
    }

}

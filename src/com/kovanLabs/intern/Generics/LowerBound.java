package com.kovanLabs.intern.Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addIntegers(intList);
        addIntegers(numList);
        addIntegers(objList);

        System.out.println(intList);
        System.out.println(numList);
        System.out.println(objList);
    }
}

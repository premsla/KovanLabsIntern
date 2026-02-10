package com.kovanLabs.intern.Generics;

import java.util.List;


public class WildCard {
    private static int sum(List<? extends Number> list){
        int sum=0;
        for(Number num:list){
            sum+=num.intValue();
        }
        return sum;
    }
}

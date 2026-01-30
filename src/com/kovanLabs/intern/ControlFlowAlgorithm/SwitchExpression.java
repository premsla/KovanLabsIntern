package com.kovanLabs.intern.ControlFlowAlgorithm;

public class SwitchExpression {
    public static void main(String[] args) {
        int day=3;
        String dayName=switch (day) {
            case 1 ->"Monday";
            case 2 ->"Tuesday";
            case 3 ->"Wednesday";
            case 4 ->"Thursday";
            case 5 ->"Friday";
            default ->"Invalid Day";
        };
        System.out.println("Day name: "+dayName);
    }
}

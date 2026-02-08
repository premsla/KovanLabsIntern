package com.kovanLabs.intern.Enum;

enum Operation {
    ADD {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    };

    // Abstract method
    abstract double apply(double x, double y);
}

public class Enumerations {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        for (Operation op : Operation.values()) {
            System.out.println(op + " result: " + op.apply(a, b));
        }
    }
}

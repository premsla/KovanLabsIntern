package com.kovanLabs.intern.JavaFundamentals;

class Parent {
    static {
        System.out.println("Parent static block");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static block");
    }
}

public class ExecutionOrder {
    public static void main(String[] args) {
        System.out.println("Main method");
        new Child();
    }
}

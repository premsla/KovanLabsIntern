package com.kovanLabs.intern.InheritancePolymorphism;

class A {
    void show() {
        System.out.println("A shows");
    }
}

class B extends A {
    void show() {
        System.out.println("B shows");
    }
}

public class override {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

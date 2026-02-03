package com.kovanLabs.intern.InheritancePolymorphism;
class Shape1 {
    Shape1 getShape() {
        System.out.println("Returning Shape");
        return this;
    }
}
class Circle1 extends Shape1 {
    @Override
    Circle1 getShape() {
        System.out.println("Returning Circle");
        return this;
    }
    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}
public class Covariant {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        Circle1 c2 = c.getShape();
        c2.drawCircle();
    }
}

package com.kovanLabs.intern.InheritancePolymorphism;
abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double area() {
        return side * side;
    }
}
public class superKeyword {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Circle(3);
        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.area();
        }
        System.out.println("Total Area of all shapes = " + totalArea);
    }
}
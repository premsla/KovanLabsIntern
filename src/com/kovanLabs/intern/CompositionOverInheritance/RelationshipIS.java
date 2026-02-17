package com.kovanLabs.intern.CompositionOverInheritance;

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Id :" + getId());
        System.out.println("Name :" + getName());
        System.out.println("Age :" + getAge());
        System.out.println("Salary :" + getSalary());
    }
}

public class RelationshipIS {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Prema", 21, 100000);
        emp.display();
        Processor processor = new Processor("Ryzen", 5);
        Ram oldram = new Ram(8);
        Storage storage = new Storage(512, "SSD");
        Computer computer = new Computer(processor, oldram, storage);
        computer.display();
        Ram newRam = new Ram(16);
        computer.upgrade(newRam);


    }

}

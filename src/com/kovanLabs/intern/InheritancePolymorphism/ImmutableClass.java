package com.kovanLabs.intern.InheritancePolymorphism;
import java.util.*;
import java.util.Date;
final class Employee {
    private final int id;
    private final String name;
    private final double salary;
    private final Date joinDate;
    public Employee(int id, String name, double salary, Date joinDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joinDate = new Date(joinDate.getTime());
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public Date getJoinDate() {
        return new Date(joinDate.getTime());
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary +
                ", joinDate=" + joinDate + "}";
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        Date date = new Date();
        Employee emp = new Employee(101, "Premalatha", 50000, date);
        System.out.println(emp);
        date.setTime(0);
        emp.getJoinDate().setTime(0);

    }
}

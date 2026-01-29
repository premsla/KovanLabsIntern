package com.kovanLabs.intern.JavaFundamentals;

import java.util.*;
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class HashMap {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");
        map.put(p1, "Developer");
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("map.get(p2): " + map.get(p2));
    }
}
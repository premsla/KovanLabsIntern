package com.kovanLabs.intern.Collections;

import java.util.*;

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        if (this == obj) return true;
        return this.id == p.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }
}


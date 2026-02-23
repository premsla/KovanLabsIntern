package com.kovanLabs.intern.CompositionOverInheritance;

class Processor {
    private String brand;
    private int core;

    public Processor(String brand, int core) {
        this.brand = brand;
        this.core = core;
    }
    public String getDetails() {
        return String.format("%s %d cores", brand, core);
    }
}

class Ram {
    private int size;

    public Ram(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class Storage {
    private int size;
    private String type;

    public Storage(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public String getStorage() {
        return String.format("%d GB %s", size, type);
    }
}

public class Computer {
    private Processor processor;
    private Ram ram;
    private Storage storage;

    public Computer(Processor processor, Ram ram, Storage storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void upgrade(Ram newRam) {
        if (newRam.getSize() > this.ram.getSize()) {
            this.ram = newRam;
            System.out.println("Ram ugraded to : " + newRam.getSize());
        } else {
            System.out.println("upgraded fails");
        }
    }

    public void display() {
        System.out.println("COMPUTER");
        System.out.println("Processor : " + processor.getDetails());
        System.out.println("Ram : " + ram.getSize());
        System.out.println("Storage : " + storage.getStorage());
    }
}

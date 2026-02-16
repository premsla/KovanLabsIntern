package com.kovanLabs.intern.Enum.RpgBattleSystem;

import java.util.Random;

abstract class Character3 {
    protected String name;
    protected int health;
    protected int strength;
    protected Random random = new Random();

    public Character3(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public abstract void attack(Character opponent);

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " takes " + damage + " damage. Health: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
}
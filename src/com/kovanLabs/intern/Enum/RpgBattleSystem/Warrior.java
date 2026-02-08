package com.kovanLabs.intern.Enum.RpgBattleSystem;

class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 20); // High health
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(10);
        System.out.println(name + " (Warrior) attacks!");
        opponent.takeDamage(damage);
    }
}

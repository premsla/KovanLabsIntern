package com.kovanLabs.intern.Enum.RpgBattleSystem;
class Mage extends Character {
    public Mage(String name) {
        super(name, 80, 30);
    }
    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(20);
        System.out.println(name + " (Mage) casts a spell!");
        opponent.takeDamage(damage);
    }
}
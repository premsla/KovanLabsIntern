package com.kovanLabs.intern.Enum.RpgBattleSystem;

class Rogue extends Character {

    public Rogue(String name) {
        super(name, 100, 18);
    }
    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(8);
        System.out.println(name + " (Rogue) strikes!");
        opponent.takeDamage(damage);
    }


    @Override
    public void takeDamage(int damage) {
        int dodgeChance = random.nextInt(100);
        if (dodgeChance < 30) {
            System.out.println(name + " dodged the attack!");
        } else {
            super.takeDamage(damage);
        }
    }
}

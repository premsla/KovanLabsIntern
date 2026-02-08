package com.kovanLabs.intern.Enum.RpgBattleSystem;

public class Arena {
    public static void main(String[] args) {

        // Polymorphism: reference type is Character
        Character p1 = new Warrior("Arjun");
        Character p2 = new Mage("Merlin");
        // Try also:
        // Character p2 = new Rogue("Shadow");

        System.out.println("⚔️ Battle Start: " + p1.getName() + " vs " + p2.getName());

        int round = 1;

        // Battle loop
        while (p1.isAlive() && p2.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");

            p1.attack(p2); // Polymorphic call
            if (!p2.isAlive()) break;

            p2.attack(p1); // Polymorphic call

            round++;
        }

        // Winner
        System.out.println("\n🏆 Winner: " +
                (p1.isAlive() ? p1.getName() : p2.getName()));
    }
}


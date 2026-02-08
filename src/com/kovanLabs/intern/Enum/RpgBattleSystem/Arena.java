package com.kovanLabs.intern.Enum.RpgBattleSystem;

public class Arena {
    public static void main(String[] args) {
        Character p1 = new Warrior("Arjun");
        Character p2 = new Mage("Merlin");
        System.out.println("⚔️ Battle Start: " + p1.getName() + " vs " + p2.getName());
        int round = 1;
        while (p1.isAlive() && p2.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");
            p1.attack(p2);
            if (!p2.isAlive()) break;
            p2.attack(p1);

            round++;
        }
        System.out.println("\n🏆 Winner: " +
                (p1.isAlive() ? p1.getName() : p2.getName()));
    }
}


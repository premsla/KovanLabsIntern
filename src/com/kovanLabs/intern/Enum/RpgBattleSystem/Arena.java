package com.kovanLabs.intern.Enum.RpgBattleSystem;

public class Arena {
    public static void main(String[] args) {
        Character p1 = new Warrior("Prema");
        Character p2 = new Mage("Thasneem");
        Character p3 = new Rogue("Priya");
        Character winner = fight(p1, p2);
        Character finalwinner = fight(winner, p3);
        System.out.println("\nFinal Winner : " + finalwinner.getName());
    }

    public static Character fight(Character c1, Character c2) {
        System.out.println("Battle Start:" + c1.getName() + " vs " + c2.getName());
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("\n Round " + round);
            c1.attack(c2);
            if (!c2.isAlive()) break;
            c2.attack(c1);
            round++;
        }
        Character winner = c1.isAlive() ? c1 : c2;
        System.out.println("Winner:" + winner.getName());
        return winner;
    }

}


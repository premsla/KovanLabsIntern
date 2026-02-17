package com.kovanLabs.intern.Enum.RpgBattleSystem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ResumeGame {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("character.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Character player = (Character) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Game loaded!");
            System.out.println("Player Name: " + player.getName());
            System.out.println("Health: " + player.health);
            Character enemy = new Mage("Enemy");
            Arena.fight(player, enemy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

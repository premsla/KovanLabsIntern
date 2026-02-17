package com.kovanLabs.intern.Enum.RpgBattleSystem;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveGame {
    public static void main(String[] args) {
        try {
            Character player = new Warrior("Prema");
            FileOutputStream fileOut = new FileOutputStream("character.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(player);
            out.close();
            fileOut.close();
            System.out.println("Game saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

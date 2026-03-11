package com.example.rpg.testing;
import com.example.rpg.Warrior;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void testHealthDoesNotDropBelowZero() {
        Warrior warrior = new Warrior("Prema");

        warrior.takeDamage(1000);

        assertEquals(0, warrior.getHealth());
        assertFalse(warrior.isAlive());
    }
}
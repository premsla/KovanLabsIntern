package com.example.rpg.testing;

import org.junit.jupiter.api.*;

class Test1 {

    @AfterAll
    static void finalCleanup() {
        System.out.println("After all tests");
    }
    @BeforeAll
    static void first(){
        System.out.print("Before every task");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
    }
}

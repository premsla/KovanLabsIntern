package com.example.rpg.testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionUtilTest {

    @Test
    void testDivideByZeroThrowsException() {

        assertThrows(ArithmeticException.class, () -> {
            DivisionUtil.divide(10, 0);
        });


    }
}
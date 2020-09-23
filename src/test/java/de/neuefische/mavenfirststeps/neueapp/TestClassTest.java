package de.neuefische.mavenfirststeps.neueapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {
    @Test
    public void test() {
        int sum = Operations.add(2,3);
        assertEquals(5, sum);
    }
    @Test
    public void anotherTest() {
        int doubleSum = 2 * Operations.add(4,7);
        assertEquals(22, doubleSum);
    }
    @Test
    public void testIfGreater() {
        boolean result = Operations.isGreater(8,7);
        assertTrue(result);
    }
}
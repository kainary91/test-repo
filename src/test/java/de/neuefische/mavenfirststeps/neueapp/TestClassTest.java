package de.neuefische.mavenfirststeps.neueapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {
    @Test
    public void test() {
        int sum = TestClass.add(2,3);
        assertEquals(5, sum);
    }
}
package com.keyin.exmple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testIsTrue() {
        Example exampleUnderTest = new Example();

        Assertions.assertTrue(exampleUnderTest.isTrue());
    }

    @Test
    public void testIncrement() {
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(2, exampleUnderTest.incrementNumber(1));
        Assertions.assertNotEquals(3, exampleUnderTest.incrementNumber(1));
    }

}

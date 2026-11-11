
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {

        assertEquals("EVEN",
                EvenOdd.checkEvenOdd(10));
    }

    @Test
    public void testOddNumber() {

        assertEquals("ODD",
                EvenOdd.checkEvenOdd(7));
    }

    @Test
    public void testZero() {

        assertEquals("EVEN",
                EvenOdd.checkEvenOdd(0));
    }

    @Test
    public void testNegativeNumber() {

        assertEquals("ODD",
                EvenOdd.checkEvenOdd(-5));
    }
}

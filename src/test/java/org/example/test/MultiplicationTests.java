package org.example.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultiplicationTests extends BaseTest {


    @Test(invocationCount = 2)
    public void getMultiplicationOfIntegers() {
        assertEquals(calculator.multiplication(1, 9), 9,
                "The result of multiplication is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 2)
    public void getMultiplicationOfNegativeNumbers() {
        assertEquals(calculator.multiplication(-1, -10), 10,
                "The result of multiplication is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getMultiplicationOfPositiveAndNegativeNumber() {
        assertEquals(calculator.multiplication(11, -9), -99,
                "The result of multiplication is wrong");
    }

    @Parameters({"numberA", "numberB"})
    @Test
    public void getMultiplicationOfNullAndPositiveNumber(int numberA, int numberB) {
        assertEquals(calculator.multiplication(numberA, numberB), 0,
                "The result of multiplication is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1, timeOut = 10)
    public void getMultiplicationOfNegativeNumberAndNull() {
        assertEquals(calculator.multiplication(-11, 0), 0,
                "The result of multiplication is wrong");
    }
}

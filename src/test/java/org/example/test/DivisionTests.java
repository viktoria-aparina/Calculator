package org.example.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivisionTests extends BaseTest {
    private final static String ERROR = "Error: Division by zero!";

    @Test(invocationCount = 2)
    public void getDivisionOfIntegers() {
        assertEquals(calculator.division(1, 10), 0.1, "The result of division is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 2)
    public void getDivisionOfNegativeNumbers() {
        assertEquals(calculator.division(-1, -9), -0.111, "The result of division is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getDivisionOfPositiveAndNegativeNumber() {
        assertEquals(calculator.division(10, -1), -10, "The result of division is wrong");
    }

    @Test(enabled = false)
    public void getDivisionOfNullAndPositiveNumber() {
        assertEquals(calculator.division(0, 5), 0, "The result of division is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getDivisionOfNegativeNumberAndNull() {
        assertEquals(calculator.division(-11, 0), ERROR, "The result of division is wrong");
    }
}

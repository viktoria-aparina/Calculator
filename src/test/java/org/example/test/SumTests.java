package org.example.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumTests extends BaseTest{


    @Test(invocationCount = 2)
    public void getSumOfIntegers() {
        assertEquals(calculator.sum(1, 9), 10,
                "The result of summation is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 2)
    public void getSumOfNegativeNumbers() {
        assertEquals(calculator.sum(-1, -10), -11, "The result of summation is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getSumOfPositiveAndNegativeNumber() {
        assertEquals(calculator.sum(11, -9), 2, "The result of summation is wrong");
    }

    @Test(description = "Counting the sum of zero and a positive number")
    public void getSumOfNullAndPositiveNumber() {
        assertEquals(calculator.sum(0, 5), 5, "The result of summation is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getSumOfNegativeNumberAndNull() {
        assertEquals(calculator.sum(-11, 0), -11, "The result of summation is wrong");
    }
}

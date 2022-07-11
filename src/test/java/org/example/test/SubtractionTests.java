package org.example.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubtractionTests extends BaseTest {

    @BeforeMethod
    public void getBeforeMethod() {
        System.out.println("This method will perform before the start of every test");
    }

    @AfterMethod
    public void getAfterMethod() {
        System.out.println("This method will perform after the end of every test");
    }

    @Test(invocationCount = 2)
    public void getSubtractionOfIntegers() {
        assertEquals(calculator.subtraction(1, 9), -8, "The result of subtraction is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 2)
    public void getSubtractionOfNegativeNumbers() {
        assertEquals(calculator.subtraction(-1, -10), 9, "The result of subtraction is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getSubtractionOfPositiveAndNegativeNumber() {
        assertEquals(calculator.subtraction(11, -9), 20, "The result of subtraction is wrong");
    }

    @Test
    public void getSubtractionOfNullAndPositiveNumber() {
        assertEquals(calculator.subtraction(0, 5), -5, "The result of subtraction is wrong");
    }

    @Test(groups = "Tests with negative numbers", priority = 1)
    public void getSubtractionOfNegativeNumberAndNull() {
        assertEquals(calculator.subtraction(-11, 0), -11, "The result of subtraction is wrong");
    }
}

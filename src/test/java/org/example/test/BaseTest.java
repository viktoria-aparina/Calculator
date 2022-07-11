package org.example.test;

import by.teachmeskills.Calculator;
import org.testng.annotations.*;

public class BaseTest {
    public Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This text will appear before suite");
    }

    @BeforeClass(groups = "Tests with negative numbers")
    public void setUp() {
        System.out.println("This method will perform before the start of all tests");
        calculator = new Calculator();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("This method will perform after the end of all tests");
        calculator = null;
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This text will appear after suite");
    }

}

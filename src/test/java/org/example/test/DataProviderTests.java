package org.example.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataProviderTests extends BaseTest {

    @DataProvider(name = "Data Provider for SumTest")
    public static Object[][] sumTests() {
        return new Object[][]
                {
                        {1, 9, 10},
                        {-1, -10, -11},
                        {11, -9, 2},
                        {0, 5, 5},
                        {-11, 0, -11}
                };
    }

    @Test(dataProvider = "Data Provider for SumTest")
    public void sumTests(int a, int b, int expectedResult) {
        assertEquals(calculator.sum(a, b), expectedResult, "The result of summation is wrong");
    }
}

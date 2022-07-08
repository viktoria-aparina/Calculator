package by.teachmeskills;

public class Calculator implements ICalculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Division by zero!");
        }
        return a / b;
    }
}

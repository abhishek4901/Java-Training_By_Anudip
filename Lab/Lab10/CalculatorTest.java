// Define the Calculator class
class Calculator {
    // Method to perform division
    public double divide(int numerator, int denominator) {
        // Ensure denominator is not zero to avoid ArithmeticException
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }
}

// Mock implementation of the Calculator class for testing
class MockCalculator extends Calculator {
    @Override
    public double divide(int numerator, int denominator) {
        // Stub the behavior for specific inputs
        if (numerator == 10 && denominator == 2) {
            return 5.0; // Return a stubbed value
        } else if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return super.divide(numerator, denominator); // Default behavior
    }
}

// Main class containing the test cases
public class CalculatorTest {
    public static void main(String[] args) {
        // Create a mock calculator object
        Calculator mockCalculator = new MockCalculator();

        // Test case 1: Stubbed behavior (numerator = 10, denominator = 2)
        try {
            double result = mockCalculator.divide(10, 2);
            System.out.println("Test Case 1 Passed: Result = " + result);
        } catch (Exception e) {
            System.out.println("Test Case 1 Failed: " + e.getMessage());
        }

        // Test case 2: Division by zero
        try {
            mockCalculator.divide(10, 0);
            System.out.println("Test Case 2 Failed: No exception was thrown");
        } catch (ArithmeticException e) {
            System.out.println("Test Case 2 Passed: Exception = " + e.getMessage());
        }

        // Test case 3: Default behavior (numerator = 20, denominator = 4)
        try {
            double result = mockCalculator.divide(20, 4);
            System.out.println("Test Case 3 Passed: Result = " + result);
        } catch (Exception e) {
            System.out.println("Test Case 3 Failed: " + e.getMessage());
        }
    }
}

package Assignment1;

public class Calculator {

    // Addition of two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction of two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication of two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division of two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    // Fibonacci sequence using recursion
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of array elements
    public double sumArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    // Mean of array elements
    public double meanArray(double[] arr) {
        return sumArray(arr) / arr.length;
    }

    // Variance of array elements
    public double varianceArray(double[] arr) {
        double mean = meanArray(arr);
        double sumSquaredDiff = 0;
        for (double num : arr) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return sumSquaredDiff / arr.length;
    }

    // Standard deviation of array elements
    public double stdDeviationArray(double[] arr) {
        return Math.sqrt(varianceArray(arr));
    }
}

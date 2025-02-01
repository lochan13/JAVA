package Assignment1;

import java.util.ArrayList;

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

    // Fibonacci sequence using loop
    public ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n < 1) {
            return null;
        }
        int a = 0, b = 1, sum = 0;
        res.add(a);
        res.add(b);
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            res.add(sum);
        }
        return res;
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

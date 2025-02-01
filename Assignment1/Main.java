package Assignment1;

/**
 * Name: LOCHAN PAUDEL
 * PRN: 23070126170
 * Batch: 2023-27
 */

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        int choice;
        do {
            choice = userInput.getMenuChoice();
            switch (choice) {
                case 1:
                    double num1 = userInput.getNumber();
                    double num2 = userInput.getNumber();
                    System.out.println("Addition: " + calculator.add(num1, num2));
                    break;
                case 2:
                    num1 = userInput.getNumber();
                    num2 = userInput.getNumber();
                    System.out.println("Subtraction: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    num1 = userInput.getNumber();
                    num2 = userInput.getNumber();
                    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    num1 = userInput.getNumber();
                    num2 = userInput.getNumber();
                    System.out.println("Division: " + calculator.divide(num1, num2));
                    break;
                case 5:
                    int n = userInput.getInteger();
                    System.out.println("Fibonacci of " + n + " is: " + calculator.fibonacci(n));
                    break;
                case 6:
                    double[] arr = userInput.getArray();
                    System.out.println("Sum of array: " + calculator.sumArray(arr));
                    break;
                case 7:
                    arr = userInput.getArray();
                    System.out.println("Mean of array: " + calculator.meanArray(arr));
                    break;
                case 8:
                    arr = userInput.getArray();
                    System.out.println("Variance of array: " + calculator.varianceArray(arr));
                    break;
                case 9:
                    arr = userInput.getArray();
                    System.out.println("Standard Deviation of array: " + calculator.stdDeviationArray(arr));
                    break;
                case 10:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 10);
    }
}

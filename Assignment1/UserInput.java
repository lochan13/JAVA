
package Assignment1;
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public int getMenuChoice() {
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");
        System.out.println("8. Variance of Array");
        System.out.println("9. Standard Deviation of Array");
        System.out.println("10. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public int getInteger() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public double[] getArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
        return arr;
    } 
    
}

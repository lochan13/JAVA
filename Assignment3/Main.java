import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StudentOperations studentOperations = new StudentOperations();
        String continueEntry;

        do {
            System.out.println("Enter the name:");
            String name = scn.next();
            System.out.println("Enter the PRN:");
            long prn = scn.nextLong();
            System.out.println("Enter the Branch : ");
            String branch = scn.next();
            System.out.println("Enter the batch: ");
            String batch = scn.next();
            System.out.println("Enter the cgpa: ");
            double cgpa  = scn.nextDouble();

            Student std = new Student(name, prn,branch,batch,cgpa);
            studentOperations.addStudent(std);

            System.out.println("Do you want to add another student? (yes/no)");
            continueEntry = scn.next();

        } while (continueEntry.equalsIgnoreCase("yes"));

        studentOperations.displayStudent();
    }
}
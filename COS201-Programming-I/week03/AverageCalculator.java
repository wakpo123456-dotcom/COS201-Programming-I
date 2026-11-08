import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();
        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();
        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // Extension: validate that every score is between 0 and 100
        boolean valid = score1 >= 0 && score1 <= 100
                && score2 >= 0 && score2 <= 100
                && score3 >= 0 && score3 <= 100;

        if (!valid) {
            System.out.println("Invalid input: each score must be between 0 and 100.");
        } else {
            double total = score1 + score2 + score3;
            double average = total / 3.0;

            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Student: " + name);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        }
    }
}

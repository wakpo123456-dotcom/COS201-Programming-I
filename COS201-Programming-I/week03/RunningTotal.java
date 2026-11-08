import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grandTotal = 0;
        String again;

        do {                                       // allows many items in one run
            System.out.print("Item: ");
            String item = in.next();
            System.out.print("Quantity: ");
            int qty = in.nextInt();
            System.out.print("Unit price: ");
            double price = in.nextDouble();

            double line = qty * price;
            grandTotal += line;
            System.out.printf("  %s x%d = %.2f%n", item, qty, line);

            System.out.print("Add another item? (y/n): ");
            again = in.next();
        } while (again.equalsIgnoreCase("y"));

        System.out.printf("Grand total: %.2f%n", grandTotal);
    }
}

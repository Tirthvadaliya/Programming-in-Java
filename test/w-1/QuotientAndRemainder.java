//Here's the code fragment that reads two integers from the keyboard and computes the quotient and remainder:
import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input two integers
        System.out.print("Enter the dividend (first number): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor (second number): ");
        int divisor = scanner.nextInt();

        // Compute the quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}

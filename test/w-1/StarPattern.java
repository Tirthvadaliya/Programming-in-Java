import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the height of the pattern
        System.out.print("Enter the height n: ");
        int n = scanner.nextInt();

        // Print the top part of the pattern (with decreasing stars)
        for (int i = n; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Print the bottom part of the pattern (with increasing stars)
        for (int i = 2; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

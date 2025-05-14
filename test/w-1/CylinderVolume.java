/*Write a Java program to calculate the volume of a cylinder given its radius and height.

Formula:

V=π×r2×h
*/
import java.util.Scanner;

public class CylinderVolume {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius and height of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume using the formula: V = π * r^2 * h
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display the result
        System.out.printf("The volume of the cylinder is: %.2f cubic units\n", volume);

        // Close the scanner
        scanner.close();
    }
}

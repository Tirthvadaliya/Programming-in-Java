import java.util.Scanner;  // Import the Scanner class

public class io {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Output: Asking the user for their name
        System.out.print("Enter your name: ");
        
        // Input: Read the user's name as a string
        String name = scanner.nextLine();
        
        // Output: Greeting the user
        System.out.println("Hello, " + name + "!");
        
        // Output: Asking the user for their age
        System.out.print("Enter your age: ");
        
        // Input: Read the user's age as an integer
        int age = scanner.nextInt();
        
        // Output: Displaying the user's age
        System.out.println("You are " + age + " years old.");
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}

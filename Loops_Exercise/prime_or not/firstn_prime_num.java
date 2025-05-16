import java.util.Scanner;

public class firstn_prime_num {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) 
        {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
       {
            if (num % i == 0) 
            {
                return false;
            } // divisible by another number
        }
        return true; // prime if no divisors found
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // Ask user for input
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Check each number from 1 to num-1
        for (int i = 1; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is non-prime");
            }
        }

        sc.close(); // close the scanner
    }
}

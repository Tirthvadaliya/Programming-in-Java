//Time complexity = O(n)
import java.util.*;

public class Striclly_IncressArray {

    public static boolean isStrictlyIncreasing(int[] arr, int index) {
        // Base case: if we reach the end of the array, return true
        if (index == arr.length - 1) {
            return true;
        }

        // Check if the current element is less than the next element
        if (arr[index] < arr[index + 1]) {
            // Recursively check the next pair of elements
            return isStrictlyIncreasing(arr, index + 1);
        } else {
            // If any pair is not strictly increasing, return false
            return false;
        }
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5}; // Example array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :-");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements of array :-");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        
        // print array

        // for (int i = 0; i < size; i++) {
        //     System.err.println(arr[i]+" ");

        // }

        boolean result = isStrictlyIncreasing(arr, 0);
        System.out.println("Is the array strictly increasing ?  :" + result);
    }

}

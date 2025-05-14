
import java.util.Scanner;

public class arrays 
{

    public static void main(String[] args) 
    {

        int[] intArr = {10, 20, 30, 40, 50}; //five values are stored directly in the array

        float[] floatArr = new float[5]; //float type array created whose size is 5

        char charArr[] = new char[5]; //an array of characters to store five elements

        Scanner sc = new Scanner(System.in);

        //manually assign different float values in the array, indexes are starting from 0
        floatArr[0] = 2.5F;
        floatArr[1] = 7.23F;
        floatArr[2] = 5.6F;
        floatArr[3] = 8F;
        floatArr[4] = 7.125F;

        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter character for index (" + i + "): ");
            charArr[i] = sc.next().charAt(0); //take input and store to character array
        }
       
        System.out.println(); //used to go for next line
            System.out.println("Printing of arrays......... ");
            System.out.println(); //used to go for next line
            System.out.print("Items of Integer array: ");

            for (int i = 0; i < 5; i++) {

                System.out.print(intArr[i] + " "); //display array content using for loop

            }

            System.out.println(); //used to go for next line

            System.out.print("Items of Float array: ");

            for (float item : floatArr) 
            {

                System.out.print(item + " "); //display array content using for-each loop
    
    }
    
            System.out.println(); //used to go for next line
            System.out.print("Items of Character array: ");

            for (char ch : charArr) 
            {
                System.out.print(ch + " "); //display array content using for-each loop
            }

            sc.close();

        }
    }


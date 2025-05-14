
public class builtinException 
{

 public static void main(String[] args) 
    {

        int[] myArray = {10, 20, 30, 40, 50}; //five elements in the array
    
        String myString = null;
        // String myString = "abcd"; //initially set the string as null

        try
         { //this try block is to handle ArrayIndexOutOfBoundsException
         
            // System.out.println("The value of myArray[1]:" + myArray[1]);
            System.out.println("The value of myArray[1]:" + myArray[10]);

         }
         catch (ArrayIndexOutOfBoundsException e) 
         {

            System.out.println("Invalid index of the array.");
         }

         try 
         { //this try block is to handle NullPointerException

           
            // System.out.println("Character at 5 of the string:" + myString.charAt(0));
            System.out.println("Character at 5 of the string:" + myString.charAt(5));
         
        }
         catch(NullPointerException e) 
         { 

            System.out.println("The string is pointing a null value.");
         }

         try
         { //this try block is to handle NumberFormatException

        
            // int number = Integer.parseInt("100"); 
            int number = Integer.parseInt("ABC"); // the string is not a valid number


            System.out.println("The number is: "+ number);
    
          }
           catch (NumberFormatException e) 
           {
            
            System.out.println("It is not a valid number.");
           
           }
    }
}


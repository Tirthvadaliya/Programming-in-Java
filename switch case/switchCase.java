import java.util.*;
public class switchCase {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) 
    {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character in capital letter: ");
    
    char character= scanner.next().charAt(0); //take the first character from given string
    
    switch (character) {
    
    case 'A':    
    System.out.println("You have typed letter A.");    
    break;
    
    case 'B':    
    System.out.println("You have typed letter B.");    
    break;
    
    case 'C':
    System.out.println("You have typed letter c.");    
    break;
    
    case 'd':
    System.out.println("You have typed letter d.");    
    break;
    
    default:
    System.out.println("You have typed letter other than  (A,B,C,D).");    
    break;
 }
  scanner.close();
   System.out.println("end the progress");    
}
}
    
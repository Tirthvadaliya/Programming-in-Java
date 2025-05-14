import java.util.Scanner;
public class simplestring
{
    public static void main(String[] args){
        char[] charString={'s','t','r','i','n','g'};//an array of characters
        Scanner sc = new Scanner(System.in);
        String str =new String(charString);//making a string for character array
        System.out.println("sring is : "+str);
        
        System.out.print("Enter the sring: ");
        // str=sc.nextLine();
        str=sc.next();
        System.out.println("You entered: "+str);

        str="new string";
        System.out.println("After changing the string: "+str);

        str="Tirth"+" "+"Patel";
        System.out.println("After concatenation: "+str);
       
        sc.close();
        
        
    }
}
import java.util.*;
public class firstn_even_num 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        num=sc.nextInt();
        
        for (int i=1; i<num; i++)
        {
            if(i%2==0)  
            // Print the even numbers
            {            
             System.out.println(i+"  is Even  ");
            }  
            // else
            // {
            //     System.out.println(i+"  is Odd  ");
            // } 
        }
    }
}
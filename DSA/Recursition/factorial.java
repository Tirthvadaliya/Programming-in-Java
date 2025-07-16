import java.util.*;

public class factorial {

    

     public static int fun(int n)
     {
        if(n==0 || n==1)
        {
            return 1;
        }
        
        int first_fact = fun(n-1);
        int cal=n*(first_fact);

        return cal;
        
    }
    
    

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=sc.nextInt();        
        // fun(n);
        System.out.println(fun(n));
    }
}
    

 

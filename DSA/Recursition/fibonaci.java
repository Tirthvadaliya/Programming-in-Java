import java.util.*;

public class fibonaci {

    

     public static void fun(int a, int b,int n)
     {
        if(n==0)
        {
         return ;
        }

        int c=a+b;
        System.out.println(c);
        fun(b, c, n-1);
        
    }
    
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n=sc.nextInt();        
        
        int a=0;
        int b=1;
        
        System.out.println(a);
        System.out.println(b);
        

        fun(a,b,n-2);

    }
}
    

 

import java.util.*;

public class sumof_firstn_num {

    

     public static void fun(int i,int n,int sum)
     {
        if(i==n)
        {
            sum = sum+i;
            System.out.print("sum :- " +sum);
          return ;
        }
        sum = sum+i;
         fun(i+1,n,sum);
    }



    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int i=1;
        System.out.print("Enter the number:-");
        int n=sc.nextInt();
        
        int sum=0;
        fun(i,n,sum);
    }
}
    


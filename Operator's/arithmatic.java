import java.util.Scanner;
class arithmatic{
    public static void main(String[] args) {
        int a,b,result;
        System.out.println("Enter the given values");
       
        Scanner sc = new Scanner(System.in);
        b=sc.nextInt();
        
       a=sc.nextInt(); 
       System.out.println(b);
       result=a+b;
       System.out.println("Sum of the given values is "+result);
      
       result=a-b;
       System.out.println("Sum of the given values is "+result);
      
       result=a*b;
       System.out.println("Sum of the given values is "+result);
      
       result=a/b;
       System.out.println("Sum of the given values is "+result);
      
       result=a%b;
       System.out.println("Sum of the given values is "+result);


    }
}
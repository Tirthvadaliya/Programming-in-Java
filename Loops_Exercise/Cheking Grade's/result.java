import java.util.*;
class demo
{
    // This is a function
    void func()
    {
        System.out.println("Enter the your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>=90 && marks<100)
        {
            System.out.println("Grade A");
        }
        else if (marks>=80 && marks<90 )
        {
            System.out.println("Grade B");
        }
        else if (marks>=70 && marks<80)
        {
            System.out.println("Grade C");
        }
        else if (marks>=60 && marks<70)
        {
            System.out.println("Grade D");
        }
        else if (marks>=30 && marks<60)
        {
            System.out.println("Grade E");
        }
        else if (marks<30 && marks>=0)
        {
            System.out.println("Fail!!");
        }
        else
        {
            System.out.println("invalid input");
        
        }
        sc.close(); // close the scanner
    }
}
class result{
    public static void main(String[] args) 
    {
        demo obj = new demo();
     int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 for 'continue' and 0 for 'exit' :- ");
        num=sc.nextInt();

        if(num==1)
        {
            
            System.out.println("Continue!!");
            obj.func();
            
        }
        else if(num==0)
        {
            System.out.println("exit!!");
             
        }
        else
        {
            System.out.println("Invalid input");
        }

      sc.close(); // close the scanner

    }
}
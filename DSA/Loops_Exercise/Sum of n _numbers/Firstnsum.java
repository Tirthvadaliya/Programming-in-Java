
import java.util.*;

class Firstnsum {

    
    public static void main(String[] args) {
        int sum = 0;
        int num;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :-");
        num = sc.nextInt();

        for(i = 1; i <= num; i++)
        {
          sum = sum + i;
        }
        // System.out.println("SUM :-"+ sum);
        System.out.println("the sum Of first " + num + " natural numbers is " + sum);
    }
}

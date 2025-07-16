import java.util.Scanner;

class numtable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the multiplication table:");
        num=sc.nextInt();

        System.out.println("table of "+num+" is :-");
        for (int i=1; i<11; i++)
        {
            int tabl = num *i;
            // Print the multiplication table
            System.out.println(num+"  *  " +i+ " =  " + tabl);
        }
    }
}
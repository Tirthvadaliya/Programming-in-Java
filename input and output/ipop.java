import java.util.Scanner;
public class ipop
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = scanner.nextLine();
        System.out.println("hello "+name);
        
        System.out.println("enter the age :");
        int age=scanner.nextInt();
        System.out.println("your age is :"+age);
        
        // System.out.println(name);
        
        System.out.println("enter the Float value :");
        float f=scanner.nextFloat();
        System.out.println("your float value is :"+f);
         scanner.close();
    }
}


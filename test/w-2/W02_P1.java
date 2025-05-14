import java.util.*;
// Define the Student class
class m {
    // Attributes of the Student class
    String name;
    int age;
    String grade;

    public m(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Grade: " + grade);
    }
}
public class W02_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String grade = sc.next();
    // Main method to create a Student object and display its information
    // public static void main(String[] args) {
    //     // Creating a Student object with sample data
        m student = new m(name,age,grade);
        
    //     // Calling the displayInfo method to print the student's details
        student.displayInfo();
    }
}

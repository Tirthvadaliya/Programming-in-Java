// Define the Student class
class Student {
    // Attributes of the Student class
    String name;
    int age;
    char grade;

    // Constructor to initialize the attributes
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display the student's information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Main method to create a Student object and display its information
    public static void main(String[] args) {
        // Creating a Student object with sample data
        Student student1 = new Student("John Doe", 20, 'A');
        
        // Calling the displayInfo method to print the student's details
        student1.displayInfo();
    }
}

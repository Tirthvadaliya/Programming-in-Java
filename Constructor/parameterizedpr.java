//Java Program to demonstrate the use of the parameterized constructor.  

class parameterizedpr {

    int id;
    String name;

    //creating a parameterized constructor  
    parameterizedpr(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values  
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        //creating objects and passing values  
        parameterizedpr s1 = new parameterizedpr(111, "Hello");
        parameterizedpr s2 = new parameterizedpr(222, "word");
        //calling method to display the values of object  
        s1.display();
        s2.display();
    }
}

//Java program to overload constructors  
class constructor_overloadingpr {

    int id;
    String name;
    int age;

    //creating two arg constructor  
    constructor_overloadingpr(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor  
    constructor_overloadingpr(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        constructor_overloadingpr s1 = new constructor_overloadingpr(111, "hello");
        constructor_overloadingpr s2 = new constructor_overloadingpr(222, "word", 25);
        s1.display();
        s2.display();
    }
}


class defaultpr {

    int id=1;
    String name="hii";

    //method to display the value of id and name  
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        //creating objects  
        defaultpr s1 = new defaultpr();
        defaultpr s2 = new defaultpr();
        //displaying values of the object  
        s1.display();
        s2.display();
    }
}

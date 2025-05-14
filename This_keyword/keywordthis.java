class Myclass {

    private int a, b; //member variable

    public Myclass(int a, int b) //constructor parameter name same as member variable
    {
        this.a = a; // this.a point to member or local variable
        this.b = b;
    }

    public Myclass() {
        this(0, 0); // calling another constructor with same parameter name
    }

    public void setdata(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

public class keywordthis
{
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
        obj.setdata(10, 20);
        obj.display();
    }
}

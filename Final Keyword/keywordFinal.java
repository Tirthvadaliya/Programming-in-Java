
class ClassA {

    final int finInteger;
    protected int myInt;
    public ClassA(int x, int y)
    {

        finInteger = x; //initialize for only one time
        myInt = y;
    }

    public ClassA()
    {
        this(0, 0);
    }

    final public void dispFinal() 
    { //final methods can not be overridden 

        System.out.println("The value of final variable: " + finInteger);
    }

    public void dispMyInt()
    {
        System.out.println("The value of MyInt: " + myInt);
    }

}

final class ClassB extends ClassA { //final class will not be extended

    protected int myInt;
    public void setMyInt(int x)
    {
        myInt = x;
    }

    @Override

    public void dispMyInt() 
    { //Overridden method 
    
        System.out.println("The value of MyInt for class B: " + myInt);
    
    }
}

public class keywordFinal 
{

public static void main(String[] args) 
{

        ClassA clA = new ClassA(10, 15);

        clA.dispFinal();
        clA.dispMyInt();

        ClassB clB = new ClassB(); //object of class b

        clB.setMyInt(50);
        clB.dispMyInt();
    }
}

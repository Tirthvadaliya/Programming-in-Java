package mathPackage;
public class MyMath {

    public double subtract(double a, double b)
     {
       return a - b; //result of double substraction
     }
    public double multiply(double a, double b)
     {
       return a * b; //result of double multiplication
     }
    public double divide(double a, double b)
     {
       return a / b; //result of double division
     }
    
     public long factorial(int num)
     {
        if(num <= 1)
        return 1;
       return num * factorial(num-1); //result of recursion
     }
}


// import java.util.*;

class staticdemo{
    static int staticvar;
    int var;
    
    public staticdemo()
    {
        var=0; // initialize non static variable to 0
    }

    public static void setstaticvar(int x) // static method only acess static variables
    {
         staticvar=x;
    }

    public void increase()
    {
     staticvar++; // increase the value of static variable
     var++; // increase the value of non static variable
    }
 
    public void display()
    {
        System.out.println("The value of static variable:"+staticvar);
        System.out.println("The value of nonstatic variable:"+var);
        System.out.println(" ");
    } 

}

public class keywordstatic
{
    public static void main(String[] args) {
         staticdemo st1 = new staticdemo();
         staticdemo st2 = new staticdemo();
           
         //increase the static variable two times using st1 object
         st1.increase();
         st1.increase();
         st1.display();
         
         
         //increase the static variable two times  using st2 object
         st2.increase();
         st2.increase();
         st2.increase();
         st2.display();

         //static member can also be accessed without any objects

         staticdemo.setstaticvar(50);
         System.out.println("Static variable without object: "+staticdemo.staticvar);

        }

}
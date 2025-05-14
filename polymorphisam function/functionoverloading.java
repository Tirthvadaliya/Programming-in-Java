public class functionoverloading {
 
   public static void area(float side) //function to get area of square
   {
    System.out.println("Area of Squere: "+(side*side));
   }


   public static void area(double radius) //function to get area of circle
   {
    System.out.println("Area of Circle: "+(3.1015*radius*radius));
   }


   public static void area(float l,float b) //function to get area of rectangle
   {
    System.out.println("Area of rectangle : "+(l*b));
   }


    public static void main(String[] args)
    {
        // call the functions
     area(4,5);
     area(5F);
     area(6D);
    }
}
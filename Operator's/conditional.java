public class conditional {
    public static void main(String[] args) {
        boolean bool1,bool2,result;

        bool1=true;
        bool2=false;
        
         result= bool1 || bool2; // true when at least one of the conditions is true
         System.err.println("the result is :"+result);
        
         result= bool1 && bool2; // true when both the conditions is true
         System.err.println("the result is :"+result);
    }
}


public class wraperClass {

    public static void main(String[] args) {
        int val = 10; //integer variable
        int res;

        //create Integer type object using int 
        @SuppressWarnings("removal")
        Integer integer = new Integer(val);

        res = integer.intValue(); //getting the int value from the Integer class object 
        System.out.println("The value of res: " + res);

        Integer myInt = 50; //automatically converts to myInt = new Integer(50) 
        System.out.println("The value of myInt: " + myInt); //internally it uses myInt.intValue()

        res = Integer.parseInt("123"); //the string '123' is converted to integer 123
        System.out.println("The value of res after increasing: " + ++res);

        res = Integer.parseInt("FE", 16); //converting string to integer assuming string is in Hexadecimal form 
        System.out.println("The value of res: " + res);

         /*
                    1         0
          FE=15 x 16 + 14 x 16  = 240 + 14 =  254
          
           
           16
          91 =64 + 16 + 8 + 2 + 1 =   1011011
                                            (2)

         */ 
        
         //use wrapper class to convert number to binary and hexadecimal form
        System.out.println("The binary of 91: " + Long.toBinaryString(91)); //here Long Wrapper class is used
        System.out.println("The hexadecimal of 91: " + Long.toHexString(91));

        String intString = integer.toString(); //integer is converted to string type variable 
        System.out.println("The value of intString: " + intString);
    }
}

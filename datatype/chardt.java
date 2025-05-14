public class chardt {
    public static void main(String[] args) {
        char mychar;

        mychar='A';// direct assign character A, with single quote
        System.out.println("The value of mychar: " +mychar);

        mychar=70; // ASCII value of a character F
        System.out.println("The value of mychar: " +mychar);

        mychar='\u0041'; // unicode hexadecimal value for interger (from 0000 to ffff)
        System.out.println("The value of mychar: " +mychar);
    }
    
}

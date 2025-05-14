public class relational {
    public static void main(String[] args) {
        boolean result;

        result = (10 == 10); //true when left operand is exactly equal with right operand
        System.out.println("The result is:" + result);

        result = (5 < 5); //true when left operand is less than right operand
        System.out.println("The result is: "+result);

        result = (5 <= 5); //true when left operand is less or equal to right operand 
        System.out.println("The result is: "+result);

        result = (10 > 5); //true when left operand is greater than right operand
        System.out.println("The result is:"+ result);

        result =(10 >= 5); //true when left operand is greater or equal to right operand 
        System.out.println("The result is:" +result);

        result =(2 != 2); //true left operand and right operand are not same 
        System.out.println("The result is:"+result);
}
}
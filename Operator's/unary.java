public class unary {
    public static void main(String[] args) {
        int var1,var2;
        
        var1=50;
        var2 = -var1; //unary operator to invert the sign of the value of var1
        System.out.println("the var1 = "+var1+", var2 = "+var2);
    
        var1=50;
        var2 = var1++; //post incrementing ,store previous value ,then increment var1 by 1
        System.out.println("the var1 = "+var1+", var2 = "+var2);
        
        var1=50;
        var2 = ++var1; //pre incrementing ,increment var1 by 1,then assign to var2
        System.out.println("the var1 = "+var1+", var2 = "+var2);
        
        var1=50;
        var2 = var1--; //post decrementing ,store previous value ,then decrement var1 by 1
        System.out.println("the var1 = "+var1+", var2 = "+var2);
        
        var1=50;
        var2 = --var1; //pre decrementing ,decrement var1 by 1,then assign to var2
        System.out.println("the var1 = "+var1+", var2 = "+var2);

        boolean bool1,result;
        bool1=true;// assign as true
        result=!bool1;
        System.out.println("the bool1 = "+bool1+", result = "+result);

    }
}
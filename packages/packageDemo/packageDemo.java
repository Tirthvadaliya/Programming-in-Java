package packageDemo;

import mathPackage.MyMath; // import math class from package named mathpackage

public class packageDemo{
    public static void main(String[] args) {
        MyMath math = new MyMath();// define object
        System.out.println("Result of (140.23-23.15): "+math.subtract(140.23,23.15));
        System.out.println("Result of (8.5*5): "+math.multiply(8.5,5));
        System.out.println("Result of (55D-7D): "+math.divide(55D,7D));
        System.out.println("Result of (6!): "+math.factorial(6));
    }
}
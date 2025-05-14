public class stringfunction {
    public static void main(String[] args) {

        String str1="HELLO", str2="hello";

        //length function to get number of charactrs in the st
        System.out.println("Length of string str1 is: "+str1.length());



        //equal method to check if two strings are equal or not(case sensitive)
        if(str1.equals(str2))
        {
            System.out.println("str1 and str2 are equal");
        }
        else
        {
            System.out.println("str1 and str2 are not equal");
        }


        //equal method to check if two strings are equal or not(case insensitive)
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("str1 and str2 are equal");
        }
        else
        {
            System.out.println("str1 and str2 are not equal");
        }

        //find the character at the given index
        System.out.println("str1_Character at index 2 is: "+str1.charAt(2));

        //compare the first string with the second string, it returns distance of first mismatched characters
        System.out.println("Distance of first mismatched character is: "+str1.compareTo(str2));



        str1="AABBCABBAA";
        str2="JAVA String Functions";

        //chech whether the given string start with or end with given substring or not
        System.out.println("the string "+str1+" is starting with AA: "+str1.startsWith("AA"));
        System.out.println("the string "+str1+" is ending with AA: "+str1.endsWith("AA"));

        //find the location of first and last occurrence of the given substring
        System.out.println("the string "+str1+" first occurrence of BB is at index: "+str1.indexOf("BB"));
        System.out.println("the string "+str1+" last occurrence of BB is at index: "+str1.lastIndexOf("BB"));

        //replace the substring with the new string
        System.out.println("the string "+str1+" after replacing AA with cc is: "+str1.replace("AA","CC"));

        //get substring from a given string
        System.out.println("the string "+str1+" substring from index 2 to 5 is :"+str1.substring(2, 5));

        //split the string by using (-) as delimiter
        str1="This-is-a-test-string";
        String[] splitArr=str1.split("-");
        // System.out.println("the string "+str1+" split by (-) is: "+splitArr);
        System.out.println("the splited part are :");
        for(String  sp :splitArr)
        {
            System.out.println(sp);
        }

        // trim the blank spaces from starting and ending of the string
        str1="        This is a test      string        ";
        System.out.println("before trimming the string:(" +str1 +  ")");
        System.out.println("after trimming blank spaces is: (" +str1.trim() + ")");


    }
}
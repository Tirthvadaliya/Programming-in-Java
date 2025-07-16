// Aim :- Print all the subsequences of a String 
// Time complexity = O(2^n)

class subseq
{
    public static void fun(String str, int index, String newstring)
    {
        if(index==str.length())
        {
            System.out.println(newstring);
            return;
        }

        //  System.out.print("to be :");
         char currentChar=str.charAt(index);
         // to be
         fun(str, index+1, newstring+currentChar);
         
         //Not to be
        //  System.out.print("Not to be :");
        fun(str, index+1, newstring);
    }



    public static void main(String[] args) 
    {
      String str="abc";
      fun(str, 0, "");   
    }
}
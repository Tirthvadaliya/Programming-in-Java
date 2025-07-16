
import java.util.HashSet;

public class unique_subseq 
{
    public static void fun(String str , int index, String newString, HashSet<String> set)
    {
        if(index==str.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;

            }
        }


        char currentChar=str.charAt(index);
        // to be
        fun(str, index+1, newString+currentChar, set);
        //not to be
        fun(str, index+1, newString, set);

    }
    public static void main(String[] args) 
    {
    //   String str="abc";
      String str="aaa";
      HashSet <String> set=new HashSet<>();
      fun(str, 0, "",set);   
    }
    
}

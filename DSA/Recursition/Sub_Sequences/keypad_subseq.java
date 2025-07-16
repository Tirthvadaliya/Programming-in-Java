//Aim:- Print keypad combination
// Time complexity = O(4^n)
public class keypad_subseq
{
    public static String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void fun(String str ,int index, String combination)
    {
        if(index==str.length())
        {
            System.out.println(combination);
            return;
        }
       char currentChar=str.charAt(index);
       String map=keypad[currentChar-'0'];

       for(int i=0; i<map.length(); i++)
       {
        fun(str, index + 1, combination + map.charAt(i));
       }
    }
    public static void main(String[] args) 
    {
        String str="23";

        fun(str, 0, "");
    }
    
}

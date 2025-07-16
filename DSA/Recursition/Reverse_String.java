public class Reverse_String 
{
    public static void fun(String str, int index)
    { 
        if(index==0)
        {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        System.out.print(" ");
        fun(str,index-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        
          fun(str, str.length()-1);
    }
}

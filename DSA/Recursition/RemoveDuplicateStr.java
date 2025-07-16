// AIM:- Remove Duplicate from String
// Time Complexity = O(n)

public class RemoveDuplicateStr 
{
 
    public static boolean [] map = new boolean[26];
    
    public static void rmvdupstr(String str, int index, String newstring)
    {
        if(index == str.length())
        {
            System.err.println(newstring);
            return;
        }

        char currChar=str.charAt(index);

        // if(map[currChar - 'a']== true) // Also valid
        
        if(map[currChar - 'a']) // by Default it take "==true"
        
        {
            rmvdupstr(str, index+1, newstring);
        }

        else
        {
            newstring += currChar;
            map[currChar - 'a'] = true;
            rmvdupstr(str, index+1, newstring);

        }

    }


    public static void main(String [] args)
    {
        String str ="abbccdeaeeaa";
        rmvdupstr(str,0,"");

    }
    
}

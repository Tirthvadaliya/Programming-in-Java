// AIM :-       Move ALL "X" To the End Of The String


public class moveEndstr {
    public static void moveAllXc(String str, int index, int count,String newString)
    {
        if(index== str.length())
        {           

            for(int i=0; i<count; i++)
            {
                newString += "x";
            }

            System.err.print(newString);

            // System.err.print(newString);
            // for(int i=0; i<count; i++)
            // {
            //     System.err.print("x");
            // }

            return;
        }


        char currentChar=str.charAt(index);
        if(currentChar == 'x')
        {
            count++;
            moveAllXc(str, index+1, count, newString);
        }
        else
        {
           newString += currentChar;
           moveAllXc(str, index+1, count, newString); 
         }

    }     

    public static void main(String[] args) 
    {
     String str="axbcxxd";

     moveAllXc(str, 0, 0, "");
    }
    
}

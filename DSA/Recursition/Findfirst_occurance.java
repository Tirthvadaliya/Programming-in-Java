// complexity is O(n)

class Findfirst_occurance
{
  public static int First=-1;
  public static int Last=-1;

  public static void Fun(String str , int index, char Element) 
  {
   
    if(index==str.length())
    {
        System.out.println(First);
        System.out.println(Last);
       return;
    }
    char current=str.charAt(index);
    if(current==Element)
     {
        if(First==-1)
        {
         First=index;
        }
     
        else
        {
        Last=index;
        }
    }
    // index++;
    // Fun(str, index,Element);
    Fun(str, index+1,Element);

  }


    public static void main(String[] args) {
        String str="habaacdaefaah";

        Fun(str,0,'a');

    }
}

class butterfly
{
    public static void fun()
    {
         int n=4;
// Upper pat:-
      //outer loop    
      for (int i=1; i<=n; i++)
      { 
        // inner loop :-1
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }

        
        //loop for space
        int space=(2*(n-i));
        for(int s=1; s<=space; s++)
        {
            System.out.print(" ");
        }

        // inner loop :-2
         for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }

         System.out.println();
      }

// Lower pat:-
      
      for(int i=n; i>=1; i--)
      {
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }


        int space2=(2*(n-i));
        for(int s=1; s<=space2; s++)
        {
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }

            System.out.println();
      }


    }


  public static void main(String [] args)
{
  fun();
}
}
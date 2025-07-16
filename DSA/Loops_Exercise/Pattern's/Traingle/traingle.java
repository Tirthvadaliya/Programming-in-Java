/**
 *        Aim: Print Following pattern
 * 
 *            *
 *           * *
 *          *   *
 *         * * * * 
 * 
 */

class traingle
{
    public static void main(String[] args)
    {
       int n=9;

       for(int i=1; i<=n; i++) 
    {

        // loop for space
        for(int k=1; k<=n-i; k++)
        // for(int k=i; k<n; k++)
        {
        System.out.print(" ");
        }

        
        //loop for first traingle
        for(int j=1; j<=i; j++)
        {
          System.out.print("*");
        }


        //loop for second traingle
        for(int j=2; j<=i; j++)
        {
        System.out.print("*");
        }


        System.out.println();
        
    }
    }
}
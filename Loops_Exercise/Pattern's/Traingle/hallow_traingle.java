/**
 *        Aim: Print Following pattern
 * 
 *            *
 *           * *
 *          *   *
 *         * * * * 
 * 
 */

class hallow_traingle
{
    public static void main(String[] args)
    {
       int n=9;

       for(int i=1; i<=n; i++) 
    {
        for(int k=1; k<=n-i; k++)
        // for(int k=i; k<n; k++)
        {
        System.out.print(" ");
        }


        for(int j=1; j<=i; j++)
        {
            if(i==n || j==1)
            {
              System.out.print("*");
             
            }
            else
            {
              System.out.print(" ");
            }
        }


        for(int j=2; j<=i; j++)
        {
         if(i==n || j==i)
            {
              System.out.print("*");
         
            }
            else
            {
              System.out.print(" ");
            }
        }


        System.out.println();
        
    }
    }
}
/** 
 *         Aim: Print Following pattern
 *         
 *            *
 *           * *
 *          *   *
 *         *     *
 *         *     *
 *          *   *
 *           * *
 *            *
 * 
 * // split the problem in two parts 
 * 
 * [1] print tringle
 * [2] print inverted tringle
 *
 *  
 */

class hallow_dimmond
{
    public static void main(String[] args)
    {
        int n=8;
         for(int i=1; i<=n; i++) 
    {
        //[Part:-1] print tringle
        // loop for space
        for(int k=1; k<=n-i; k++)
        // for(int k=i; k<n; k++)
        {
        System.out.print(" ");
        }

        
        //loop for first traingle
        for(int j=1; j<=i; j++)
        {
          if(j==1)
          {
          System.out.print("*");
          }
          else
          {
          System.out.print(" ");
          }

        }


        //loop for second traingle
        for(int j=2; j<=i; j++)
        {
         if(j==i)
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


    
    
    
    
    
    
    
    //[Part:-2] print tringle

      
      for(int i=n; i>=1; i--) 
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
           if(j==1)
          {
          System.out.print("*");
          }
          else
          {
          System.out.print(" ");
          }
        }


        //loop for second traingle
        for(int j=2; j<=i; j++)
        {
         if(j==i)
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
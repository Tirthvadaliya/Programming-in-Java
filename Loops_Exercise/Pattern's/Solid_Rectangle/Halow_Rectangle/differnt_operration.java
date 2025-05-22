    /** 
          Aim:[1] Print Following pattern
             *
             *                  // for up  to down and left to right use following condition:--
             *                                                                               " n/2+1 "
             *
     * * * * * * * * *
             *
             *
             *
             *
              
*/

    /** 
          Aim:[2] Print Following pattern
              *
                *            // for up  major diagonal use following condition:-- " i==j "
                  *
                    *
*/

    /** 
          Aim:[3] Print Following pattern
                    *
                  *      // for up  minor diagonal use following condition:-- " i+j == n+1 "
                *  
              *
*/
    /** 
          Aim:[4] Print Following pattern
              *      *
                *  *       // mixup of Aim 2 and Aim3 :-
                * *                                       if() 
              *     *
            *         *
*/


class differnt_operration
{





    public static void operation1()
    {
        int n=9;
     

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if (i==(n/2+1) || j==(n/2+1)) 
                {
                 System.out.print("* ");                    
                }
                else
                {
                 System.out.print("  ");
                }
            }
                System.out.println();
        }
    }   




    public static void operation2()
    {
      int n=5;
     

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if (i==j)
                {
                 System.out.print("* ");                    
                }
                else
                {
                 System.out.print("  ");
                }
            }
                System.out.println();
        } 
    } 



    public static void operation3()
    {
      int n=5;
     

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if (i+j == n+1)
                {
                 System.out.print("* ");                    
                }
                else
                {
                 System.out.print("  ");
                }
            }
                System.out.println();
        } 
    }   
 
 
 
    public static void operation4()
    {
      int n=5;
     

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if ( i==j || i+j == n+1 )
                {
                 System.out.print("* ");                    
                }
                else
                {
                 System.out.print("  ");
                }
            }
                System.out.println();
        } 
    }   
    
      public static void main(String [] args)
    {
    //   operation1();
        //  operation2();
        //  operation3();
         operation4();
    }
}
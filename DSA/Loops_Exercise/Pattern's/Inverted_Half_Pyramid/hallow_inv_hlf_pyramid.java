/** 
          Aim: Print Following pattern
              ****
              ***
              **
              * 
*/
class hallow_inv_hlf_pyramid
{
  public static void main(String [] args)
{
    //Method:-1
    int n=8;
    for(int i=1; i<=n; i++)
    {
        for(int j=n; j>=i; j--)
        // for(int j=i; j<=n; j++)  // also valid
        {
            if (i==1 || j==n ||j==i) {
                
            System.out.print("*");
            }
            else{

            System.out.print(" ");
            }
        }
    System.out.println();
    }
    
    // Method:-2
    // int n=8;
    // for(int i=n; i>=1; i--)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
           
    //         if (i==n || j==1 ||j==i) {
                
    //         System.out.print("*");
    //         }
    //         else{

    //         System.out.print(" ");
    //         }
    //     }
    // System.out.println();
    // }
}
}
/** 
          Aim: Print Following pattern
                 *
                **
               ***
              **** 
*/
class invrot_pyramid
{
  public static void main(String [] args)
{
    int n=4;
    for(int i=1; i<=n; i++)
    {
        // inner loop for Space
        for(int s=1; s<=n-i; s++)
        {
          System.out.print(" ");
        }
        // inner loop for , print"*"
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
            // System.out.print(j);
        }
    System.out.println();
    }
}
}
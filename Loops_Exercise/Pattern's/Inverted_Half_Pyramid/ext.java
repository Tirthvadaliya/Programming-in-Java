/** 
          Aim: Print Following pattern
              1111
              222
              33
              4 
*/
class ext
{
  public static void main(String [] args)
{
    //Method:-1
    int n=4;
    for(int i=1; i<=n; i++)
    {
        for(int j=4; j>=i; j--)
        {
            System.out.print(i);
        }
    System.out.println();
    }
    
    // Method:-2
    // int n=4;
    // for(int i=n; i>=1; i--)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("i");
    //     }
    // System.out.println();
    // }
}
}
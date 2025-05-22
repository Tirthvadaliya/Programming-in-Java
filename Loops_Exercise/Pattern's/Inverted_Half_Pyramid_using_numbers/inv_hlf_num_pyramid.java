/** 
          Aim: Print Following pattern
              12345
              1234
              123
              12
              1
*/
class inv_hlf_num_pyramid
{
  public static void main(String [] args)
{
    //Method:-1
    int n=5;
    for(int i=n; i>=1; i--)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
    System.out.println();
    }
    
    //Mehod:-2
    // int n=5;
    // for(int i=1; i<=n; i++)
    // {
    //     for(int j=1; j<=6-i; j++)
    //     {
    //         System.out.print(j);
    //     }
    // System.out.println();
    // }
}
}
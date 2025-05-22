/** 
          Aim: Print Following pattern
              1
             212
            32123
           4321234
          543212345
*/
class tra_num_different_ptr
{
    public static void fun()
    {
         int n=5;
    for(int i=1; i<=n; i++)
    {
        // First part
        
        // inner loop for Space
        for(int s=1; s<=n-i; s++)
        {
          System.out.print(" ");
        }

        // inner loop for print pattern
        for(int j=i; j>=2; j--)
        {
            // System.out.print("*");
            System.out.print(j);
        }

        // Second part
          for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
      System.out.println();
    }

    }


  public static void main(String [] args)
{
  fun();
}
}
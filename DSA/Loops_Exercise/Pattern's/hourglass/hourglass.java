class hourglass
{
    public static void firstpart()
    {
      
      //[part:-1]   

      // first half traingle
      int n=5;
      for(int i=n; i>=1; i--)
      {
        for(int s=1; s<=n-i; s++)
        {
            System.out.print(" ");
        }
        
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }


      // second half traingle

       for(int j=2; j<=i; j++)
        {
            System.out.print("*");
        }
            System.out.println();
      }

    }     
     
     
     
     
      public static void secpart()
    {
      
      //[part:-2]   

      // first half traingle
      int n=5;
      for(int i=1; i<=n; i++)
      {
        for(int s=1; s<=n-i; s++)
        {
            System.out.print(" ");
        }
        
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }


      // second half traingle

       for(int j=2; j<=i; j++)
        {
            System.out.print("*");
        }
            System.out.println();
      }

    }
    public static void main(String[] args)
{
     firstpart();
     secpart();
}
}
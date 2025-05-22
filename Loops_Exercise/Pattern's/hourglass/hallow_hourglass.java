class hallow_hourglass
{
      public static void operation()
    {
      int n=5;
     

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if ( i==1||i==n||i==j || i+j == n+1 )
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
    public static void main(String[] args)
{
     operation();
}
}
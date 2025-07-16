/**
 *            1
 *           2 2
 *          3 3 3
 *         4 4 4 4 
 * 
 */

class tra_num
{
    public static void main(String[] args)
    {
       int n=4;

       for(int i=1; i<=n; i++) 
    {
        for(int k=1; k<=n-i; k++)
        {
        System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
        System.out.print(i+" ");
        // System.out.print(" ");
        }
        System.out.println();
        
    }
    }
}
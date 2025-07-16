/*
 *      Aim:-  Print x^n(stack height = n)
 * 
 *      
 * 
 * 
 *       here n-->infinite 
 *        so we solve the problem
 * 
 * 
 */


public class FirstPro 
{
    public static int calcpower(int x,int n)
    {
        if(x==0)
        {
            return 0;

        }
        if(n==0)
        {
            return 1;

        }
        int xpowernm1 = calcpower(x,n-1);
        int xpower=x * xpowernm1;
        return xpower;
    }
    public static void main(String[] args) 
    {
        int x=2,n=5;
        int ans=calcpower(x,n);
        System.out.println(ans);
        
    }    
}
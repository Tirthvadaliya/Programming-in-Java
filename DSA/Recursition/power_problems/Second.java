/*
*      Aim:-  Print x^n(stack height = logn)
* 
*      
* 
* 
*       here n-->infinite 
*        so we solve the problem
* 
* 
*/
public class Second 
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
        
        // if n is Even

        if(n%2==0)
        {
            return calcpower(x, n/2) * calcpower(x, n/2);
        }
        // if n is Odd
        else  
        {
            return calcpower(x, n/2) * calcpower(x, n/2)*x;

        }

    }
    public static void main(String[] args) 
    {
        int x=2,n=5;
        int ans=calcpower(x,n);
        System.out.println(ans);
        
    }    
}
    


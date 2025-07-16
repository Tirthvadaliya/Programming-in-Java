class oneto_n_num
{
     public static void fun(int n)
     {
        if(n==6)
        {
          return ;
        }
        System.out.println(n);
        fun(n+1);

    }



    public static void main(String [] args)
    {
        int n=1;
        fun(n);
    }
}
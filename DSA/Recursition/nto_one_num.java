public class nto_one_num {

 
     public static void fun(int n)
     {
        if(n==0)
        {
          return ;
        }
        System.out.println(n);
        fun(n-1);

    }



    public static void main(String [] args)
    {
        int n=6;
        fun(n);
    }
}


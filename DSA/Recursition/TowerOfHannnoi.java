public class TowerOfHannnoi {
    public static void fun(int n, String source , String helper, String destination)
    {
        if(n==1)
        {
            System.out.println("Transfer Disk "+n+" From "+source+" To "+destination);
           return;
        }
        fun(n-1 , source , destination , helper);
        System.out.println("Transfer Disk "+n+" From "+source+" To "+destination);
        fun(n-1 , helper , source , destination);

    }
    public static void main(String[] args) {
        int n=2;
          fun(n,"S","H","D");
    }
}

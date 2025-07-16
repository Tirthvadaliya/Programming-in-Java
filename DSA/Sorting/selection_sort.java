class selection_sort
{
    public static void func(int arr[])
    {
        for (int i=0; i<arr.length; i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        // int arr[] = {7,8,3,2,1};
        int arr[] = {7,8,3,2,1,6,4,5,0,9};
        

         // Time complexity = O(n^2)
         // outer loop
        for(int i=0; i<arr.length-1; i++) // n-1 pass 
        {
            int smallest=i;
           //main loop
           for(int j=i+1; j<arr.length; j++)
           {
             if(arr[smallest]>arr[j]) // find the smallest element
             {
                smallest=j;
             }

           }
            // swap element
             int temp = arr[smallest]; 
             arr[smallest]=arr[i];
             arr[i]=temp;

           
        }
        func(arr);

    }
}
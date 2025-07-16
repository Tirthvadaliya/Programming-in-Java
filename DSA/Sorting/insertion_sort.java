class insertion_sort
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
          int current=arr[i];
          int j=i-1;

          while(j>=0 && current < arr[j])
          {
              arr[j+1] = arr[j];
              j--;
          }
           arr[j+1]=current;
        }
        func(arr);

    }
}
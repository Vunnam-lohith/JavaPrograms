class SelectionSort
{
    public static void sort(int arr[])
    {
       int temp=0;
       for(int i=0;i<arr.length;i++)
       {
           int min=i;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]<arr[min])
               min=j;
           }
           temp=arr[min];
           arr[min]=arr[i];
           arr[i]=temp;
       }
        
    }
    public static void main(String args[])
    {
        int a[]={34,12,78,56,45,66};
        System.out.println("before sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sort(a);
        System.out.println();
        System.out.println("after sorting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
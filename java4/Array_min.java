import java.util.*;
class Array_min
  {
    public static void main(String args[])
    {
      int min,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the values ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      min=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(arr[i]<min)
          {
            min=arr[i];
          }
        }
      System.out.println("the minimum element in the array is : "+min);
         
  }
  }
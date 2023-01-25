import java.util.*;
class Array2
  {
    public static void main(String args[])
    {
     int a[]={34,56,78,90};
      int n=a.length;
      int b[]=new int[n];
      //copying the elements from the array
      for(int i=0;i<n;i++)
        {
          b[i]=a[i];
        }
    System.out.println("elements are in the second array ");
      for(int i=0;i<n;i++)
        {
          System.out.print(b[i]+)" ");
        }
    }   
      
  }
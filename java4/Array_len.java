import java.util.*;
class Array_len
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("array elements are");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
      
              }
  }
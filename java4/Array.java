import java.util.*;
class Array
  {
    public static void main(String args[])
    {
      int a[]=new int[6];
      Scanner sc=new Scanner(System.in);
     System.out.println("enter array elements");
      for(int i=0;i<6;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the array elements are ");
      for(int i=0;i<6;i++)
        {
          System.out.print(a[i]+" ");
        }      
   }
  }
//Linear Search
import java.util.*;
class LinearSearch
  {
    public static void linearSearch(int a[],int key)
    {
       int count=0;
      int i;
       for(i=0;i<a.length;i++)
        {
          if(key==a[i])
          {
            count++;
            break;
          }
          
        }
      if(count>0)
      {
        System.out.println("element is find at "+ i +" location");
      }
      else
      {
        System.out.println("element is not found");
      }
      
    }
    public static void main(String args[])
    {
          
      int arr[]={34,89,12,90,23,44,78};
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the element to search");
      int key=sc.nextInt();
      linearSearch(arr,key);
    }
  }
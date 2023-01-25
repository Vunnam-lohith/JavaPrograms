import java.util.*;
class Array_dup
{
  public static void main(String[]args)
  {
    Scanner ntr=new Scanner(System.in);
    int n;
    System.out.println("Enter the size : ");
    n=ntr.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Elements : ");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=ntr.nextInt();
      }
    for(int j=0;j<arr.length;j++)
      {
        for(int k=j+1;k<arr.length;k++)
          {
            if(arr[j]==arr[k])
            {
              int dup=arr[j];
              System.out.println("The duplicate Number is : " +dup);
            }
          }
      
      } 
   
  }
  
}
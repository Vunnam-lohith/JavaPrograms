import java.util.*;
class Alter
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
     for(int i=0;i<arr.length;i+=2)
      {
        
        System.out.println(arr[i]);
      }
    
  }
}
  
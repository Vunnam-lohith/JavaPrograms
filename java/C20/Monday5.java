//WAJP to find all pairs of elements from an array who's sum is equal to given number
import java.util.*;
class Monday5
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int s=ntr.nextInt();
      int n=0;
      int arr[]=new int[s];
      for(int i=0;i<s;i++)
        {
          arr[i]=ntr.nextInt();
        
        }
      System.out.println("Enter the number: ");
      int num = ntr.nextInt();
      for(int i=0; i<arr.length; i++){
         for (int j=i; j<arr.length; j++){
            if((arr[i]+arr[j])== num && i!=j){
               System.out.println(arr[i]+" + "+arr[j]+" = "+num);
              }
            }
         }
      }
      
    }
  
//WAJP to add an element at the specified array index in the array list
/*import java.util.*;
import java.util.ArrayList;
class Monday5
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int i=ntr.nextInt();
      ArrayList<Integer> sc=new ArrayList<Integer>(i);
      for(int j=0;j<i;j++)
        {
          sc.add(ntr.nextInt());
        }
      System.out.println("Enter the index you want enter the new number");
      int num=ntr.nextInt();
      System.out.println("Enter the value to be engtered");
      int val=ntr.nextInt();
      for(int f=0;f<num;f++)
        {sc.add(num,val);}
      
      System.out.println(sc);
      System.out.println("Size of the array is "+sc.size());
    }
  }*/
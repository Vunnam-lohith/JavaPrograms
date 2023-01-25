/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems 
{
  public static void main(String[]args)
  {
    double max;
    int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      double arr[]=new double[n];
      System.out.println("enter the values ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextDouble();
        }
      max=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }
        }
      System.out.println("The highest price you incurred is : "+max);
  }

}

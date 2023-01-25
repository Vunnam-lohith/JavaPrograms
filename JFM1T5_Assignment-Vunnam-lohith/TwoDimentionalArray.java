/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray 
{
  public static void main(String[]args)
  {
     int r,c,max=0,v=0,v2=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter row size and column size");
      r=sc.nextInt();
      c=sc.nextInt();      
      int a[][]=new int[r][c];
      System.out.println("enter the values in to 2D array");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              //a[i][j]=sc.nextInt();
              System.out.println("Elements ["+i+","+j+"] :"+(a[i][j]=sc.nextInt()));
            }
        }
     System.out.println();
     max=a[0][0];
    for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
             if(a[i][j]>max)
               max=a[i][j];
                v=j;
              
            }
          
         v2=i;
        } System.out.println("Largest element in array is "+max+" and its index position is "+v2+" , "+v );
    
    
  }

}
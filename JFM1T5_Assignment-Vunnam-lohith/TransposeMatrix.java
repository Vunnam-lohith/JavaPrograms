/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix 
{
  public static void main(String[]args)
  {
    int r,c;
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
              System.out.println("Elements ["+(i+1)+","+(j+1)+"] :"+(a[i][j]=sc.nextInt()));
            }
        }
     System.out.println();
      System.out.println("  The array elements are ");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              System.out.print("["+i+","+j+"]: "+a[i][j]+" ");
            }
          System.out.println();
        }
     System.out.println();
    System.out.println("  After Transpose Matrix ");
    for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              System.out.print("["+i+","+j+"] : "+a[j][i]+" ");
            }
          System.out.println();
        }
      }
    
  }




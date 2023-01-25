/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.*;
public class ArraySum 
{
  public static void main(String[]args)
  {
    Scanner ntr=new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n=ntr.nextInt();
    int sum=0;
    int arr[]=new int[n];
    System.out.println("Enter the elements of the array : ");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=ntr.nextInt();
        sum=sum+arr[i];
      }
    System.out.println("Sum of elements in the array : "+sum);
  }

}

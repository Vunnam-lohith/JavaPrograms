/*  JFM1T12_Assignmwnt4:

    Write a Java program to reverse elements in an arraylist.
    Prompt the user input from the terminal.
     
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    995
    Enter Number 1
    367
    Enter Number 2
    511
    Enter Number 3
    789
    Enter Number 4
    111
    
    Expected Output:
    Elements after reversing:111 789 511 367 995  

 */

import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList  
{
  public static void main(String[]args)
  {
    Scanner ntr=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int i=ntr.nextInt();
    ArrayList<Integer> sc=new ArrayList<Integer>(i);
    for(int j=0;j<i;j++)
    {
      System.out.println("Enter number "+j);
      sc.add(ntr.nextInt());
    }   
    Collections.reverse(sc);     
    System.out.println("Elements after Reversing:"+sc);    
  }
}
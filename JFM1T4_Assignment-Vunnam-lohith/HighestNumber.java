/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.*;

public class HighestNumber {
  public static void main(String[]args)
  {
     Scanner s= new Scanner(System.in);
     System.out.println("Enter the first number");
     int n1=s.nextInt();
     System.out.println("Enter the second number");
     int n2=s.nextInt();
     System.out.println("Enter the third number");
     int n3=s.nextInt();
    System.out.println();
    if(n1>=n2&&n1>=n3)
    {
      System.out.println(n1+" is the Greatest ");
    }else if(n2>=n3)
    {
      System.out.println(n2+" is the Greatest");
    }else
    {
      System.out.println(n3+" is the Greatest");
    }
    
  }


 

 
}
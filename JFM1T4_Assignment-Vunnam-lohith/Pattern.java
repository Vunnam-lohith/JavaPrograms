/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/


//Add main method here

//Declare variable n and initialize value as 5

//Check whether the i and j are equal or not using for loop

//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero

import java.util.*;
class Pattern
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int v;
      System.out.print("Enter the value for ROWS : ");
      v=ntr.nextInt();
      System.out.println(" ");
      for(int i=0;i<v;i++)
        {
           System.out.print(" ");
          for(int j=1;j<=i;j++)
              {
                if((i+j)%2==0)
                {
                  System.out.print("1 ");
                }System.out.print("0 ");
            
              }
          System.out.println(" ");
        }
      
    }
  }
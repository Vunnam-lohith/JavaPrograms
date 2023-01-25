/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
   public static void main(String[]args)
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a=sc.nextInt();
    System.out.println("Enter second number: ");
    int b=sc.nextInt();
    int sum,diff,pro,div,inc,dec,rem;
    sum=a+b;
    diff=a*b;
    inc=a++;
    dec=a--;
    rem=a%b;
    System.out.println(" Difference of 2 numbers : "+diff);
    System.out.println(" Sum of 2 numbers : "+sum);
    System.out.println(" Increment of a numbers : "+inc);
    System.out.println(" Decrement of a numbers : "+dec);
    System.out.println(" Remainder of 2 numbers : "+rem);
  }


//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}
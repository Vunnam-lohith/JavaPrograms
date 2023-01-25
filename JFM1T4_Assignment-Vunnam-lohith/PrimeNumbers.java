/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/


import java.util.Scanner;

public class PrimeNumbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, count;
        System.out.println("Enter lower bound of the interval: ");
        a = sc.nextInt(); 
        System.out.println("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); 
        System.out.println("\nPrime numbers between "+a+" and "+b+" are: ");
        for (int i=a;i<=b;i++)
          {
            if (i==1 || i==0)
              continue;
            count=1;
            for (int j=2;j<=i/2;++j)
              {
                if (i % j == 0)
                {
                    count=0;
                    break;
                }
             }
            if (count==1)
                System.out.println(i);
         }
    }
}
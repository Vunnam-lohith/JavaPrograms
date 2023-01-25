/* Write a program to check whether a number is positive or negative
Test Data 1: x=31
Expected Output: Number is positive
Test Data 2: x=-31
Expected Output: Number is negative
*/
import java.util.*;
class Exercise1 {

	public static void main(String args[]) {
    Scanner ntr=new Scanner(System.in);
    int n;
    System.out.println("Enter a value");
    n=ntr.nextInt();
    if(n>0)
    {
      System.out.println(n+"Given number is positive");
    }else{
      System.out.println(n+"Given number is negative");
    }
    


	}

}
/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {
  public static void main(String[]args)
  {
    Scanner ntr=new Scanner(System.in);
    System.out.println("Enter the value ");
    int n=ntr.nextInt();
    String str=String.valueOf(n);
    System.out.println(str.charAt(2));
  }


}
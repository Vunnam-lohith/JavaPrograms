/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {
  public static void main(String[]args)
  {
    Scanner ntr =new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=ntr.nextLine();
    System.out.println("Enter search string : ");
    String s=ntr.nextLine();
    boolean result=s.contains(str);
    if(result)
    {
      System.out.println(s+" is found");
    }
    System.out.println(s+" is not found");
    
  }


}
/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.*;
public class StaticBlock
{
  String name;
  int rollno;
  static
  {
    static String clgname="IIT";
  }
  StaticBlock(String name,int rno)
  {
   this.name=name;
   rollno=rno;
  }
  void display()
  {
    System.out.println("the student detials are");
      System.out.println(name+" "+rollno+" "+clgname);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Students");
      int n=sc.nextInt();
      StaticBlock num[]=new StaticBlock [n];
      for(int i=0;i<n;i++)
        {
          num[i]=new StaticBlock();
         System.out.println("enter student name");
          num[i].name=sc.next();
          System.out.println("enter student rollno");
          num[i].rollno=sc.nextInt();
          num[i].display();
        }
      System.out.println("the students details are");
      for(int i=0;i<n;i++)
        {
       System.out.println("Student id = "+num[i].rollno);
      System.out.println("Student name = "+num[i].name);
         
        }
  }
}

//main method

//initialize Student class constructor for three times

//Create an array and add the 3 student to it

//take input from user 3 times using for loop 

//creating Student class and declaring variables

//creating staticBlock in that give collegename

//add getters and setters

//creating dispCollegename static method 
     

//check the logic and you have to use static block and take the college name as static 

public class StaticVariable
{
 static int rollno=0;
   String name;
  StaticVariable()
  {
     rollno++;
      System.out.println("Rollno is: "+rollno);
      System.out.println("Name is: "+name);
  }
  public static void main(String args[])
  {
       StaticVariable obj=new StaticVariable("Shree");
    StaticVariable obj1=new StaticVariable("Balaji");
    StaticVariable obj2=new StaticVariable("Ajay");
  }
}

public class StaticVariable
{
 static int rollno=0;
   String name;
  StaticVariable(String name)
  {
    this.name=name;
     rollno++;
      System.out.println("Rollno is: "+rollno);
      System.out.println("Name is: "+name);
  }
  public static void main(String args[])
  {
       StaticVariable obj=new StaticVariable("Shree");
    StaticVariable obj1=new StaticVariable("Balaji");
    StaticVariable obj2=new StaticVariable("Ajay");
  }
}


import java.util.*;
public class StaticBlock
{
  String name;
  int rollno;
  static
  {
     String clgname="IIT";
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
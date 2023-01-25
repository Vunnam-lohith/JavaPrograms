import java.util.*;
class Person
  {
    void name()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the name");
      String n=ntr.nextLine();
      System.out.println(n);
    }
    void age()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the age");
      int a=ntr.nextInt();
      System.out.println(a);
    }
    void eat()
    {
      System.out.println("eating");
    }
    void walk()
    {
      System.out.println("walkiing");
    }
  }
class Student extends Person
  {
    void roll()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the Rool no.");
      int b=ntr.nextInt();
      System.out.println(b);
    }
    void study()
    {
      System.out.println("Student will Study now");
    }
    void standard()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the level of the class");
      int c=ntr.nextInt();
      System.out.println(c);
    }
    public static void main(String[]args)
    {
      Student obj=new Student();
      obj.name();
      obj.age();
      obj.roll();
      obj.standard();
      obj.study();
      obj.eat();
      obj.walk();
    }
  }

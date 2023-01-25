import java.util.*;
class Method
  {
    public static void AreaOfSquare(double a)
    {
      double Area=a*a;
      System.out.println("the area of the square is "+Area);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      double a=sc.nextDouble();
      AreaOfSquare(a);   
    }
  }
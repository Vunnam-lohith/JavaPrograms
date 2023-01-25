//Static Method
import java.util.*;
class Factorial
  {
    public static void fact(int num)
    {
      int fact=1;
      for(int i=1;i<=num;i++)
        {
          fact=fact*i;
        }
      System.out.println("the factoral of num is :"+fact);
    }
  }
    class StaticMethod
      {
     public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      Factorial.fact(n);
    }
         
  }
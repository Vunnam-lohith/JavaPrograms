import java.util.*;
class Method2
  {
    public static void multiple(float a, float b)
    {
      float multiple=(a*b);
      System.out.println("Multiplied value is: "+multiple);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      float a=sc.nextFloat();
      System.out.println("enter the b value");
      float b=sc.nextFloat();
      multiple(a,b);
      
    }
  }
import java.util.*;
class SimpleIntrest
  {
    public static void main(String args[])
    {
      Scanner ntr=new Scanner(System.in);
      double p,t,r,si;
      System.out.println("enter the initial principal balance : ");
      p=ntr.nextDouble();
      System.out.println("enter the initial time : ");
      t=ntr.nextDouble();
      System.out.println("enter the initial annual interest rate : ");
      r=ntr.nextDouble();
      si=(p*t*r)/100;
      System.out.println("simple interest is : "+si);
    }
  }
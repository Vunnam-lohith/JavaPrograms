import java.util.*;
class Divisible
  {
    public static void main(String[]args){
      Scanner ntr=new Scanner(System.in);
      System.out.print("Enter any  Number : ");
      int n;
      n=ntr.nextInt();
      if(n%5==0&&n%11==0)
      {
        System.out.println("Given Number Is Divisble By 5 and 11");
      }else
        System.out.println("Given Number Is Not Divisble By 5 and 11");
    }
  }
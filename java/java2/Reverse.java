/*import java.util.*;
class Reverse {
  public static void main(String[] args){
    Scanner ntr=new Scanner(System.in);
    int n , rev = 0;
    System.out.println("Enter Any Value :");
    n=ntr.nextInt();
    while(n != 0) 
    {
      int i = n % 10;
      rev= rev * 10 + i;
      n = n / 10;
    }
    System.out.println("Reversed Number: " + rev);
  }
}*/
import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      int num,first=0,last=0,digit=0,rev=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number to reverse");
      num=sc.nextInt();
      first=num%10;
      while(num>0)
        {
          digit=num%10;
          rev=rev*10+digit;
          num=num/10;
          
        }
      System.out.println(rev);
     last=digit;
      System.out.println("first digit "+first+"  "+"last digt"+"   "+last);
            
    }
  }
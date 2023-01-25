//with return type and without argument
import java.util.*;
class Method3and4{
  public static int mut()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the a value:");
    int a=sc.nextInt();
    System.out.println("enter the b value:");
    int b=sc.nextInt();
    int c=a*b;
    return c;
  }
  public static int mut(int x,int y){
    int c=x*y;
    return c;
  } 
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
      System.out.println("enter the a values:");
    int a=sc.nextInt();
     System.out.println("enter the b values:");
    int b=sc.nextInt();
    int result=mut();
    System.out.println("the muti of 2 numbers:"+result);
    int result1=mut(a,b);
    System.out.println("the mut of 2 numbers is:"+result1);
 }
  
}

 


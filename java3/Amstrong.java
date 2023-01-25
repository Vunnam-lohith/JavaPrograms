//check whether a number is a amstrong number or not.
import java.util.*;
class Amstrong
{
public static void main(String[] args)
{
  int num,length=0,sum=0;
  Scanner ntr=new Scanner(System.in);
  System.out.print("Enter any Numerical : ");
  num=ntr.nextInt();
  int original=num;
  while(num!=0)
    {
        length=length+1;
         num=num/10;
    }
  System.out.println("--------------------------------------------");
  System.out.println("The length of the given number : "+length);
  System.out.println("--------------------------------------------");
  int num1=original;
  while(num1!=0)
  {
    int result=1;
    int digit=num1%10;
    for(int i=1;i<=length;i++)
      {
        result=result*digit;
        //System.out.println("Digit ; "+digit);
      }
   //System.out.println(result);
    
        sum+=result;
        num1=num1/10;
  }
  if(original==sum)
  {
    System.out.println("Given number is an amstrong number");
  }else
  {System.out.println("Given number is not an amstrong number ");}
}
}
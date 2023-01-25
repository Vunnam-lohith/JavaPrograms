import java.util.*;
class Monday1
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int n,fact,sum=0;
      System.out.println("Give any Numerical");
      n=ntr.nextInt();
      int dd=n;
      while(n!=0)
        {
          fact=1;
          int Digit=n%10;
          for(int i=1;i<=Digit;i++)
        {
          fact=fact*i;
        }
          //System.out.println("fact = "+fact);
          sum+=fact;
          //System.out.println(sum);
          n=n/10;
        }
      if(sum==dd)
      { 
        System.out.println("The Strong  of the Given Number is : "+sum);
      }else{
        System.out.println("The Given number is not a Strong Number");
      }
      
        
    }
  }
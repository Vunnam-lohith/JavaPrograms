import java.util.*;
class Multiplication
  {
    public static void main(String[] args) 
    {
      Scanner ntr=new Scanner(System.in);
      int n,val=0;
      System.out.print("Enter number:");       
      n=ntr.nextInt(); 
      for(int i=1; i <= 10; i++)
        {
          val=n*i;
          System.out.println(n+" * "+i+" = "+val);
        }
    }
  }  
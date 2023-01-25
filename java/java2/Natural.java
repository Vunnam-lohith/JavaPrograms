import java .util.*;
class Natural
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int i,n,sum=0,count=0;
      System.out.println("Enter the natural number");
      n=ntr.nextInt();
      System.out.println("------------------------------------");
      System.out.println("Even Numbers :");
      for(i=1;i<=n;i++)
        {
         
          if(i%2==0)
          {
            System.out.print(i+",");
          }
          
        }
      System.out.println();
      System.out.println("Odd Numbers :");
      for(i=1;i<=n;i=i+2)
        {
          
          System.out.print(i+",");
        }
      System.out.println();
      System.out.println("The sum of the natural numbers :");
     for(i=1;i<=n;i++)
        {
         sum=sum+i;
          i++;
        }
      System.out.println(sum);
    }
    
  }
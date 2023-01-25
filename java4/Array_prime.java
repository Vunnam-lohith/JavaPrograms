import java.util.*;
class Array_prime
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int count,n;
      System.out.println("Enter the size  : ");
      n=ntr.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the Elements : ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=ntr.nextInt();
        }
      for(int j=0;j<a.length;j++)
          {
            count=0;
            for(int k=1;k<=a[j];k++)
              {
                if(a[j]%k==0)
                {
                 count++;
                }
              }
             if(count==2)
             {
               System.out.println("The Prime Number is : "+a[j]);
             }
          }
        
    }
  }
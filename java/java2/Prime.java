/*import java.util.*;
class Prime{
  public static void main(String args[])
  {
    int i,num,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    for(i=1;i<=num;i++)
      {
        if(num%i==0)
        {
          count++;
        }
      
        if(count==2)
        {
          System.out.println(i);
        }
        else
        {
          System.out.println("not prime");
        }
      }
  }
}

import java.util.*;
class Prime{
  public static void main(String args[])
  {
    int i,num,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    for(i=1;i<=num/2;i++)
      {
        if(num%i==0)
        {
          System.out.println(i);
        }
      }
        
  }
}*/


import java.util.*;
class Prime
{
	public static void main(String arg[])	
	{
	int count;
  System.out.print("Enter any value : ");
	Scanner ntr=new Scanner(System.in);
	int num=ntr.nextInt();
  System.out.println("Prime numbers between 1 to "+num+" are ");
	for(int j=2;j<=num;j++)
	  {
      count=0;
      for(int i=1;i<=j;i++)
      {
        if(j%i==0)
        {
          count++;
        }
	    }
      if(count==2)
        System.out.print(j+" , "); 
    }
	}
}
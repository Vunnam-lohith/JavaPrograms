import java.util.*;
class Arrayyy
  {
    public static void main(String[]args)
    {
      int n,x,count=0;
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the size : ");
      n=ntr.nextInt();
      int a[]=new int[n];
      System.out.println(" Enter the Elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=ntr.nextInt();
        }
      System.out.println("Enter the elements you want to find :");
      x=ntr.nextInt();
      int i,pos=0;
      for(i=0;i<a.length;i++)
        {
          if(a[i]==x)
          {
            count++;
             pos=i;
          }
            
          }
      if(count>0)
      {
        System.out.println("Element fount at poosition : "+(pos+1));
      }else{
            System.out.println(" Element Not found");
        }
    }
  }
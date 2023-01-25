import java.util.*;
class Monday3
  /*{
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=ntr.nextInt();
      int a[]=new int[n];
      int count;
      boolean vis[]=new boolean[n];
      System.out.println("Enter the elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=ntr.nextInt();
        }
      for(int i=0;i<a.length;i++)
        {
          vis[i]=false;
        }
      System.out.println("");
      for(int i=0;i<a.length;i++)
        {
          count=1;
          if(vis[i]==true)
          
            continue;
            for(int j=i+1;j<a.length;j++)
              {
                if(a[i]==a[j])
                {
                  count++;
                  vis[j]=true;
                }
              }
            //System.out.println("the frequency of"+a[i]+" is "+count);
          System.out.println("");
          if (count==1)
          {
            System.out.println("unique element is "+a[i]);
          }
          System.out.println("");
        }
    }
  }*/
{
  public static void main(String[]args)
  {
    Scanner ntr=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=ntr.nextInt();
    int a[]=new int[n];
    int element;
    System.out.println("Enter the elements into the array");
    for(int i=0;i<a.length;i++)
      {
        a[i]=ntr.nextInt();
      }
    System.out.println("enter the index position you want to delete");
    element=ntr.nextInt();
    int i=0;
    for(i=0;i<a.length-1;i++)
      {
    if(element==a[i])
    {
      a[i]=a[i+1];
      
    }
      }
    System.out.println(" "+a[i]);
  }
}
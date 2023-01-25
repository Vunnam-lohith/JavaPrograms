import java.util.*;
class Pattern1
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int v,f;
      System.out.print("Enter the value for ROWS : ");
      v=ntr.nextInt();
      System.out.print("Enter the value for COLUMNS : ");
      f=ntr.nextInt();
      System.out.println(" ");
      for(int i=1;i<=v;i++)
        {
          for(int j=1;j<=f;j++)
              {
            System.out.print("*"+" ");
              }
          System.out.println(" ");
        }
      
    }
  }
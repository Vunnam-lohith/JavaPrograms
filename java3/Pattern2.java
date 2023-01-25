import java.util.*;
class Pattern2
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int v;
      System.out.print("Enter the value for ROWS : ");
      v=ntr.nextInt();
      System.out.println(" ");
      for(int i=0;i<v;i++)
        {
           System.out.print(" ");
          for(int j=0;j<=i;j++)
              {
            System.out.print("* ");
              }
          System.out.println(" ");
        }
      
    }
  }
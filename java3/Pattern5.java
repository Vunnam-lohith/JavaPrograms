import java.util.*;
class Pattern5
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int v;
      System.out.print("Enter the value for ROWS : ");
      v=ntr.nextInt();
      System.out.println(" ");
      for(int i=1;i<=v;i++)
        {
          for(int j=(v-i);j>=0;j--)
            {
               System.out.print(" ");
            }
          for(int j=1;j<=i;j++)
            {
              System.out.print("* " );
            }
          System.out.println(" ");
        }
      
    }
  }
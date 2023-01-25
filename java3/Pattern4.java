import java.util.*;
class Pattern4
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
          for(int j=v-i;j>0;j--)
            {
              System.out.print("* " );
            }
          System.out.println(" ");
        }
      
    }
  }
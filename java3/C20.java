//  WAJP to  print all the p-rime numbers b/w 1 to 100  

import java.util.*;
class C20
  {
    public static void main(String[]args)
    {
      int n,i,count=0;
      for(i=2;i<=5;i++)
        {
          //count=0;
          for(n=1;n<=i;n++)
            {
              if(i%n==0)
              {
                count++;
              }
            }System.out.println("count is"+count);
          if(count==2)
          {System.out.print(i+" , ");}
        }
    }
  }

/*while(i<=10)
  {
    System.out.print(i+" ");
    i++;
  }*/
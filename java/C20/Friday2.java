import java.util.*;
class Friday2
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      boolean bool=true;
       System.out.print(" Enter the Amount : ");
                int n=ntr.nextInt();
      while(bool)
        {
          
          System.out.print(" Enter to : \n1.Debit\n2.Withdraw\n3.Check Balance\n0.To Exit \n-> ");
          int ATM=ntr.nextInt();
          
         
          switch(ATM)
            {
                
               
                
              case 0:
                bool=!bool;
                break;
              case 1:
                System.out.println("Enter the Amount to be debited :\n");
                int num=ntr.nextInt();
                num+=n;
                n=num;
                break;
              case 2:
                System.out.println("Enter the Amount to  Withdraw :\n");
                num=ntr.nextInt();
                num-=n;
                n=num;
                break;
              case 3:
                System.out.println("Balance : "+n+"\n");
                //bool=!bool;
                break;
            }
        }
      
        }
  }

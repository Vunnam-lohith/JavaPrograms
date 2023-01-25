import java.util.*;
class Collections
  {
    public static void main(String args[])
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int i=ntr.nextInt();
      
      ArrayList<Integer> vl=new ArrayList<Integer>(i);
      for(int j=0;j<i;j++)
        {
          if(j%2==0){
            System.out.println("Enter the elemnet into "+j);
          vl.add(ntr.nextInt());
          }else
          {vl.add(0);}
        }
     
      System.out.println(vl);
      System.out.println("Size of the array is "+vl.size());
      
    
      }
  }
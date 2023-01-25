import java.util.*;
class Arrays
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      Arrays[] arr=new Arrays[5];
      arr[0] = "First Pair";
      arr[1] = new Integer(1);
      arr[2] = "Second Pair";
      arr[3] =new Integer(2);
      arr[4] = "Third Pair";
      arr[5] = new Integer(3);
      for(int i=0;i<5;i++)
        {
          System.out.println(arr[i]);
        }
      //System.out.println(arr[1]);
    }
  }
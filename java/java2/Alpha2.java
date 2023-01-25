import java.util.*;
class Alpha2
  {
    public static void main(String[]args)
    {
      Scanner ntr=new Scanner(System.in);
      int ch;
       System.out.print("Give any sort of input :  ");
      ch=ntr.next().charAt(0);
      if(Character.isAlphabetic(ch))
        System.out.println(ch+"Is An Alphabet ");
      else
         System.out.println(ch+"Is Not An Alphabet ");
      
    }
  }
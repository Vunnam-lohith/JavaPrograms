//capacity()
import java.util.*;
class StringBufferCap
  {
    public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity()); //16
      sb.append("hello");
       System.out.println(sb.capacity()); //16
      sb.append("welcome bitlabs");
      System.out.println(sb.capacity()); //34
      sb.ensureCapacity(50);
      System.out.println(sb.capacity());
    }
  }
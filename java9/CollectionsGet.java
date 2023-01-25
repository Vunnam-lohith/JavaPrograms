import java.util.*;
class CollectionsGet
  {
    public static void main(String args[])
    {
      ArrayList vl=new ArrayList();
      vl.add("Vunnam");
      vl.add(7);
      vl.add(69.7f);
      vl.add('C');
      vl.add("CR7");
      System.out.println(vl);
      System.out.println(vl.size());
      System.out.println(vl.get(0));
      System.out.println(vl.set(3,77));
      System.out.println(vl);
      for(int i=0;i<vl.size();i++)
        {
          System.out.println(vl.get(i));
        }
    }
  }
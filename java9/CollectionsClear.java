import java.util.*;
class CollectionsClear
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
    System.out.println(al);
   ArrayList<String> al1=new ArrayList<String>(al.size());
      al1.addAll(al);
      al1.add("banana");
      al1.add("grapes");
      al1.add("mango");
      System.out.println(al1);
      al1.removeAll(al);
      System.out.println(al1);
      al.clear();
      al1.clear();
      System.out.println(al);
      System.out.println(al1);
      
      
    }
  }
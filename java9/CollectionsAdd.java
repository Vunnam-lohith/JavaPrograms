//Copying elements from one list to another list
import java.util.*;
class CollectionsAdd
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
      
    }
  }
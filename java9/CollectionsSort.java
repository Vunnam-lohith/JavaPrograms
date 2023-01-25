import java.util.*;
class CollectionsSort
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
      System.out.println("befor sorting");
      System.out.println(al);
    //Iterating the element using iterator interface
      System.out.println("after sorting");
      Collections.sort(al);
      System.out.println(al);
      Collections.reverse(al);
      System.out.println(al);
    }
  }
//Write a Java program to search an element in a array list.
import java.util.*;
class CollectionsFind
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
    //Iterating the element using iterator interface
      Scanner sc=new Scanner(System.in);
      System.out.println("enter element to search");
      String str=sc.next();
     if(al.contains(str))
     {
       System.out.println("element is found");
     }
      else
       System.out.println("element not found");
      }
  }
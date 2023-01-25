/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/
import java.util.*;

public class HdTvStock 
{
  int price;
  String brandname;
  int size;
  Hdtv(int price,String brandname,int size)
  {
    this.price=price;
    this.brandname=brandname;
    this.size=size;
  }
}
class SizeComparator implements Comparator<Hdtv>
{
  public int compare(Hdtv hd1,Hdtv hd2)
  {
    if(hd1.size==hd2.size)
      return 0;
    else if(hd1.size>hd2.size)
      return 1;
    else
      return -1;
  }
}
class Brandname implements Comparator<Hdtv>
{
  public int compare(Hdtv hd1,Hdtv hd2)
  {
    return hd1.brandname.compareTo(hd2.brandname);
  }
}
public class HdTvStock
{
  public static void main(String args[])
  {
    Hdtv h1=new Hdtv(3000,"MI",27);
    Hdtv h2=new Hdtv(2000,"LG",26);
    Hdtv h3=new Hdtv(4000,"SONY",20);
    Hdtv h4=new Hdtv(1000,"SAMSUNG",28);
    ArrayList<Hdtv> al=new ArrayList<Hdtv>();
    al.add(h1);
    al.add(h2);
    al.add(h3);
    al.add(h4);
    System.out.println("Sort by  TV Screen Size");
    SizeComparator sc=new SizeComparator();
    Collections.sort(al,sc);
    for(Hdtv hd:al)
    {
      System.out.println(hd.price+" "+hd.brandname+" "+hd.size);
    }
  }
}

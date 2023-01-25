import java.util.*;
class TreeSet
  {
    public static void main(String args[])
    {
    TreeSet<Character> ts=new TreeSet<Character>();
      ts.add('O');
      ts.add('U'); //ascending order
      ts.add('C'); //null values are not allowed
      ts.add('N'); //duplicate values are not allowed
      ts.add('A');
      System.out.println(ts);
            System.out.println(ts.descendingSet());
/*   ts.pollFirst();
     System.out.println(ts);
      ts.pollLast();
      System.out.println(ts); */
     System.out.println("head set:"+ts.headSet('C'));
      System.out.println("tail set:"+ts.tailSet('N'));
      System.out.println("sub set:"+ts.subSet('A','U'));
      System.out.println("head set:"+ts.headSet('C',true));
      System.out.println("tail set:"+ts.tailSet('N',false));
       System.out.println("subset:"+ts.subSet('A',true,'U',true));
    
    }
  }
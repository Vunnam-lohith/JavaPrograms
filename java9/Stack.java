import java.util.*;
class Stack
  {
    public static void main(String args[])
    {
      Stack<Integer> stk=new Stack<Integer>();
      stk.push(34);
      stk.push(45);
      stk.push(12);
      stk.push(56);
      System.out.println(stk);
      stk.pop();
      System.out.println(stk);
      System.out.println(stk.peek());
      System.out.println(stk.search(12));
    }
  }
//Method overriding
class A
  {
    int m=10;
    void display()
    {
      System.out.println("the value of m is:"+m);
   }
  }
class B extends A
  {
  int n=20;
    void display()
    {
      System.out.println("the value of n is"+n);
    }
  }
    class PolyEx
      {
        public static void main(String args[])
        {
          B bo=new B();
          bo.display();
          A ao=new A();
          ao.display();
        }
      }
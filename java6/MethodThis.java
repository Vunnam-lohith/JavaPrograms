//to refer current class methods
class A
  {
    void x()
    {
      System.out.println("hello x");
    }
    void y()
    {
      System.out.println("hello y");
     this.x();
    }
  }
class ThisEx1
  {
    public static void main(String args[])
    {
    A obj=new A();
    obj.y();
    }
  }
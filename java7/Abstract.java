//multiple inheritance
interface InterfaceDemo1
  {
    abstract public void show();
  }
interface InterfaceDemo2
  {
    abstract public void print();
  }
class Sample implements InterfaceDemo1,InterfaceDemo2
  {
    public void show()
    {
      System.out.println("hi hello welcome");
    }
    public void print()
    {
      System.out.println("hi welcome to bitlabs");
    }
  }
class InterfaceEx1
  {
    public static void main(String args[])
    {
      Sample obj=new Sample();
      obj.show();
      obj.print();
    }
  }
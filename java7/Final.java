//final variable
class FinalEx
  {
    final int a=10;
    void display()
    {
     a=100;
      System.out.println(a);
    }
    public static void main(String args[])
    {
      FinalEx obj=new FinalEx();
      obj.display();
    }
  }
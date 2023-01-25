class Polymorphisim
  {
    void sum(int x,int y)
    {
      int z=x+y;
      System.out.println("the sum is"+(z));
    }
    void sum(int x,int y,int z)
    {
      int w=x+y+z;
      System.out.println("the sum is"+(w));
    }
    public static void main(String args[])
    {
      PolyExample obj=new PolyExample();
      obj.sum(10,20);
      obj.sum(10,20,30);
    }
  }
//Method overloading
class PolyExample
  {
    public int sum(int x,int y)
    {
      int z=x+y;
     return z;
    }
    public double sum(double p,double q)
    {
      double w=p+q;
      return w;
    }
    public static void main(String args[])
    {
      PolyExample obj=new PolyExample();
      int sum=obj.sum(10,20);
      double result=obj.sum(12.3,10.5);
      System.out.println(sum);
      System.out.println(result);
    }
  }
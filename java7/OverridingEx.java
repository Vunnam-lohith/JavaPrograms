class Circle
  {
    void areaCalculation(int x)
    {
      double result=3.14*x*x;
      System.out.println("the area of circle is : "+result);
    }
  }
class Square extends Circle
  {
    void areaCalculation(int x)
    {
      int result=x*x;
      System.out.println("the area of square is : "+result);
    }
  }
class PolymorEx3
  {
    public static void main(String args[])
    {
      Circle ci=new Circle();
      ci.areaCalculation(6);
      Square sq=new Square();
      sq.areaCalculation(5);
    }
  }
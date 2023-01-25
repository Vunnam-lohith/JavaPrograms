//Method overloading
class OverloadingArea
  {
    void calculateArea(int a)
    {
      System.out.println("area of the square");
      int result=a*a;
      System.out.println(result);
    }
    void calculateArea(int l,int b)
    {
      System.out.println("area of the rectangle");
      int result=l*b;
       System.out.println(result);
    }
    void calculateArea(double r)
    {
      System.out.println("area of the circle");
      double result=3.14*r*r;
       System.out.println(result);
    }
    public static void main(String args[])
    {
      AreaCalculation ac=new AreaCalculation();
      ac.calculateArea(3); //
      ac.calculateArea(12,5);
      ac.calculateArea(4.0);
      
    }
  }
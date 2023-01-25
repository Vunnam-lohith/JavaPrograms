interface Area
  {
  abstract public void areaCalculation();
  }
class Rectangle implements Area
  {
    public void areaCalculation()
    {
      int w=10;
      int l=20;
      int a=w*l;
       System.out.println("Area of rectangle is "+a);
     
    }
  }
class Square implements Area
  {
  public void areaCalculation()
    {
    int q=10;
    int z= q*q;
     System.out.println("Area of square is "+z);
    }
  }
class Circle implements Area
  {
  public void areaCalculation()
    {
    double pi=3.14;
    int r=10;
    double c=pi*r*r;
       System.out.println("Area of circle is "+c);
    }
}
class Ex
  {
    public static void main(String args[])
    {
      Area s=new Rectangle();
      Area st=new Square();
      Area str=new Circle();
      s.areaCalculation();
        st.areaCalculation();
        str.areaCalculation();
    }
   
  }
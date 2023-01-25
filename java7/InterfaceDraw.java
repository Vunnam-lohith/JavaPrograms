interface Shape
  {
  abstract public void draw();
  }
class Rectangle implements Shape
  {
    public void draw()
    {
      System.out.println("drawing rectangle");
    }
  }
class Square implements Shape
  {
    public void draw()
    {
      System.out.println("drawing square");
    }
  }
class InterfaceEx
  {
    public static void main(String args[])
    {
      Shape s=new Rectangle();
      Shape st=new Square();
      s.draw();
      st.draw();
    }
  }
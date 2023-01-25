abstract class Sample
  {
    abstract public void show();
        
  }
class Main extends Sample
  {
      public void show()
    {
      System.out.println("this is a abstract method implementation");
    }
  }
class AbstractEx
  {
    public static void main(String args[])
    {
      Main obj=new Main();
      obj.show();
    }
  }
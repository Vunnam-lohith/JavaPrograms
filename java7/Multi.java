//Multilevel Inheritance
class LandLine
  {
    void dial()
    {
      System.out.println("dialing");
    }
  }
class CellPhone extends LandLine
  {
    
    void chat()
    {
      System.out.println("chatting");
    }
  }
class SmartPhone extends CellPhone
  {
    void videocall()
    {
      System.out.println("video calling");
    }
  }
class TestInheritance
  {
    public static void main(String args[])
    {
      SmartPhone obj=new SmartPhone();
      obj.dial();
      obj.chat();
      obj.videocall();
    }
  
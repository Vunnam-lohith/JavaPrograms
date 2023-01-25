class Method9
  {
    static int a;
    static{
      a=50;
      System.out.println("this is static block");
      System.out.println("the value is:"+a);
    }
    public static void main(String args[])
    {
      System.out.println("this is a main method");
    }
  }
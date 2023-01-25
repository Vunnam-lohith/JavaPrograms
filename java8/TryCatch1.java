class TryCatch1
  {
    public static void main(String args[])
    {
      try{
        //inner try block 1
        try
          {
            String s=null;
            System.out.println(s.contains("s"));
          }
        catch(NullPointerException e)
          {
            System.out.println(e);
              e.printStackTrace();
          }
        //inner try block 2
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(ArithmeticException e)
          {
            System.out.println(e);
              e.printStackTrace();
          }
      }
      catch(Exception e)
        {
          System.out.println("this is parent class");
        }
      System.out.println("exception handled");
    }
  }
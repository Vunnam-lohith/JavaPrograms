//Finally 
class Finally
  {
    public static void main(String args[])
    {
      
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(ArithmeticException e)
          {
            System.out.println("this is catch block");
              e.printStackTrace();
          }
    
      finally{
        System.out.println("this is finally block");
      }
      System.out.println("exception handled");
    }
  }
//Finally 
/*class Finally
  {
    public static void main(String args[])
    {
      
        try
          {
            int c=20/0;
            System.out.println(c);
          }
        catch(NullPointerException e)
          {
            System.out.println("this is catch block");
              e.printStackTrace();
          }
    
      finally{
        System.out.println("this is finally block");
      }
      System.out.println("exception handled");
    }
  }*/
//Exception
class ExceptionEx
  {
    public static void main(String args[])
    {
      int a[]={56,12,89,90};
      try{
      for(int i=0;i<=a.length;i++)
        {
          System.out.println(a[i]);
        }
      }
      catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(e);
          e.printStackTrace();
        }
      System.out.println("exception handled");
      System.out.println("welcome to bitlabs");
    }
  }
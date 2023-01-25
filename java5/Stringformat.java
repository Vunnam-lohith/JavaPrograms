//format()
class Operations
  {
    public static void main(String args[])
    {
    String s1=String.format("%d",234);
    String s2=String.format("%f",45.67);
    String s3=String.format("%c",'a');
    String s4=String.format("%s","sowjanya");
    String s=String.format("%.3f",45.672323);
      System.out.println(s); //45.672
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
      
    }
  }
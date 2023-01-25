class Stringcount
  {
    public static void main(String[]args)
    {
      String str="lohith@6789";
      int count_a=0,count_n=0,count_s=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='A'&& str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')
          {
            count_a++;
          }else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
          {
            count_n++;
          }else
          {
            count_s++;
          }
        }
      System.out.println("Alphabet count is :"+count_a);
      System.out.println("Digits count is :"+count_n);
      System.out.println("Special character count is :"+count_s);
    }
  }
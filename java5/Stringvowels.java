class Stringvowels
  {
    public static void main(String[]args)
    {
      String str="Lohith";
      int count_v=0,count_c=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
          {
            count_v++;
          }else{
            count_c++;
          }
        }
      System.out.println("Vowels are : "+count_v);
      System.out.println("Consonents are : "+count_c);
    }
  }

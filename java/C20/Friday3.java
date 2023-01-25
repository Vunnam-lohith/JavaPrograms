class Friday3
  {
    public static void main(String[]args)
    {
      String s="madam konws malayalam";
      System.out.println("Given String is :\n"+s+"\n");
      String[] word=s.split(" ");
      String large="";
      String rev="";
      int len=word[0].length();
      for(int i=0;i<word.length;i++)
        {
          if(word[i].length()>=len)
          {
            large=word[i];
            for (int j=large.length()-1;j>=0;j--)
            {
              rev=rev+large.charAt(j);
            }
            if(large.equals(rev))
            {
              System.out.println("given String is an largest palindrome \n");
            }
          }
        }
      System.out.println("The largest word in the given string is: "+large+" with the length: "+large.length());
    }
  }

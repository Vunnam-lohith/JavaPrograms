import java.util.*;
 class ASCII 
 {
   public static void main(String[] args) 
   {
     Scanner ntr = new Scanner(System.in);
     System.out.println("Enter any caracter : ");
     char ch = ntr.next().charAt(0);
     if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
     {
       System.out.println(ch + " is A ALPHABET.");
     } else if(ch >= '0' && ch <= '9')
     {
       System.out.println(ch + " is A DIGIT.");
     } else {
       System.out.println(ch + " is A SPECIAL CHARACTER.");
     }
   }
}


import java.util.*;

class ASCII {
    public static void main(String[] args) 
  {
    Scanner ntr= new Scanner(System.in); 
    System.out.println("Enter any caracter : ");
    char ch = ntr.next().charAt(0);
    if (Character.isAlphabetic(ch))
    {
      System.out.println(ch + " is A ALPHABET.");
    } else if (Character.isDigit(ch)) 
    {
      System.out.println(ch + " is A DIGIT.");
    } else 
    {
      System.out.println(ch + " is A SPECIAL CHARACTER.");
    }
  }
}
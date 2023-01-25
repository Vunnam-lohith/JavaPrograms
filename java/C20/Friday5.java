//WAP to find the length of the last word in a given string
import java.util.*;

class Friday5
  {
    public static void main(String[]args)
    {
      Scanner ntr = new Scanner(System.in);
      int count=0;
      int count1=0;
      System.out.println("Enter any string");
      String str=ntr.nextLine();
      String[] word=str.split(" ");
      count1=word[1].length();
      count = word[word.length-1].length();
       System.out.println("length of the First word "+word[word.length]+" is "+count1);
      System.out.println("length of the last wor "+word[word.length-1]+" is "+count);
      int finals=count1-count;
      System.out.println("Differce B/w the lenghts of the end words in a given string "+finals);
     
    }
  }


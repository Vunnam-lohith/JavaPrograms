import java.util.*;
/*class Friday4
  {
    public void display()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.print("Enter the students name: ");
      String str=ntr.nextLine();
      System.out.print("Enter the marks for Maths :");
      float s1=ntr.nextFloat();
      System.out.print("Enter the marks for Science :");
      float s2=ntr.nextFloat();
      System.out.print("Enter the marks for English :");
      float s3=ntr.nextFloat();
      System.out.print("Enter the marks for 2nd language :");
      float s4=ntr.nextFloat();
      System.out.print("Enter the marks for 3rd language :");
      float s5=ntr.nextFloat();

      double tot ,per;
      tot=s1+s2+s3+s4+s5;
      per=(tot/500)*100;
      System.out.println("Percentage of "+str+" is "+per);
      if(per>=90)
      {
        System.out.println("Grade = A");
      }
      else if(per>=80&&per<90)
      {
        System.out.println("Grade = B");
      }
      else if(per>=70&&per<80)
      {
        System.out.println("Grade = c");
      }
      else
        System.out.println("Grade = Fail");
    }
    public static void main(String[]args)
    {
      Friday4 obj=new Friday4();
      obj.display();
      
    }
  }*/
class Friday4
  {
    public static void main(String[]args)
    {
      String str="hi how are you";
      String first,str1="",s;
      //int count=0;
      String[] word=str.split(" ");
      System.out.println(word.length);
      for(String n: word)
        {
           first=n.substring(0,1);
           first=first.toUpperCase();
           s=n.substring(1);
           str1=str1+first+s+" ";
        
        }
      System.out.println(str1);
      
    }
  }
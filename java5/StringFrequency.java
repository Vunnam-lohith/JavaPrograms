//Highest frequency of character
import java.util.*;
class StringFrequency
  {
    public static void main(String args[])
    {
     int max=0;
     char ch='0';
      Scanner sc=new Scanner(System.in);
      String a;
      System.out.println("enter the String is ");
      int count=1;
      a=sc.nextLine();
      int n=a.length();
     boolean s1[]=new boolean[n];
 
      for(int i=0;i<n;i++)
        {
          s1[i]=false;
        }
   //   System.out.println("the frequency of the character ");
      for(int i=0;i<n;i++)
          {
         if(s1[i]==true)
          continue;
            count=1;
            for(int j=i+1;j<n;j++)
                 {
                   if(a.charAt(i)==a.charAt(j))
                   {
                     count++;
                     s1[j]=true;
                   }
                 }
// System.out.println(a.charAt(i)+"    "+count);
if(max<count)
{
     max=count;
     ch=a.charAt(i);
}              
              
}
System.out.println("highest frequency of the character is  "+ch+"---->"+max);
          }
    }
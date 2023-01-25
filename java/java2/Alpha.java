/*import java.util.*;
class Alpha
{
public static void main(String args[])
  {
    char ch;
    Scanner ntr=new Scanner(System.in); 
    System.out.println("Enter the character  ");
    ch=ntr.next().charAt(0);
    if(ch>='A' && ch<='Z')
    {
    System.out.println(ch+" is an upper case letter ");
    }
    else if(ch>='a' && ch<='z')
    {
    System.out.println(ch+" is a lower case letter ");
    }
    else
    {
    System.out.println(ch+" is not a Alphabets ");
    }
  }
}*/


/*class Alpha
  {
    public static void main(String[] args)
    {
        char i;
        System.out.printf("The Alphabets from A to Z are: \n");
        for (i = 'A'; i <= 'Z'; i++) {
            
            System.out.printf("%c ", i);
        }
        System.out.printf("\nThe Alphabets from a to z are: \n");
        for (i = 'a'; i <= 'z'; i++) {
            System.out.printf("%c ", i);
        }
    }
  }*/

import java.util.*;
class Alpha
{
  public static void main(String args[])
  {
   /* Scanner ntr=new Scanner(System.in);
    System.out.println("enter the Char:");*/
    char ch='a';
    char cha='A';//=ntr.next().charAt(0);
    System.out.println("Displaying Alphabets from a to z :");
   do 
		{
			System.out.print(ch + " ");
		} while (++ch <= 'z');
     System.out.println(" ");
    System.out.println(" ");

     System.out.println("Displaying Alphabets from A to Z :");

    while(cha<='Z')
      {
         System.out.print(cha+" ");
        cha++;
      }
      
  }
}
/*   JFM1T12_Assignment5:

     Write a program to build any collection containing duplicates. Create its copy with all duplicates removed. 
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     4
     Enter Number 0
     4
     Enter Number 1
     3
     Enter Number 2
      3
     Enter Number 3
     4
     
     Expected Output:
     After removing duplicates: [4, 3]
*/     
import java.util.*; 
import java.util.ArrayList; 

class Duplicate  
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many numbers you want: ");
    int size=sc.nextInt();
    ArrayList<Integer> al=new ArrayList<>();
    for(int i=0;i<size;i++)
    {
      System.out.println("Enter Number: "+i);
      al.add(sc.nextInt());
    }
    Set<Integer> al1=new LinkedHashSet<>(al);
    System.out.println("After removing duplicates:"+al1);
  }
}
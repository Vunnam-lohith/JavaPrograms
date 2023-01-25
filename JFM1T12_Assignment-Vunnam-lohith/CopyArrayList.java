/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/
import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  
{ 
  public static void main (String args[])
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
    System.out.println("-----Iterating over the second ArrayList----");
    ArrayList<Integer> al1=new ArrayList<>(al);
    for (Integer value : al1) 
    {
            System.out.println(value);
    }
  }
}

import java.util.Scanner;

public class BooleanOperation {
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
System.out.println("Enter y as boolean value(true/false):");
    boolean y=sc.nextBoolean();
    boolean a=x&&y;
    boolean b=x||y;
    boolean c=!x;
    boolean d=!y;
    System.out.println("x&&y is: " +a);
    System.out.println("x||y is: " +b);
    System.out.println("!x is: " +c);
    System.out.println("!y is: " +d);
  }

}
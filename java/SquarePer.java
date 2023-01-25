import java.util.*;

class SquarePer {
  public static void main(String args[]) {
    Scanner ntr = new Scanner(System.in);
    double a, ar, per;
    System.out.println("enter the value of sides  : ");
    a = ntr.nextDouble();
    ar = a * a;
    per = 4 * a;
    System.out.println("Area of trfiangle is : " + ar);
    System.out.println("Area of trfiangle is : " + per);
  }
}
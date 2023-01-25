import java.util.*;

class Triangle {
  public static void main(String args[]) {
    Scanner ntr = new Scanner(System.in);
    double a, b, c, h, ar, per;
    System.out.println("enter the value of  side A : ");
    a = ntr.nextDouble();
    System.out.println("enter the value of Base B : ");
    b = ntr.nextDouble();
    System.out.println("enter the value of side C : ");
    c = ntr.nextDouble();
    System.out.println("enter the value of height H : ");
    h = ntr.nextDouble();
    ar = (h * b) / 2;
    per = a + b + c;
    System.out.println("Area of trfiangle is : " + ar);
    System.out.println("Area of trfiangle is : " + per);
  }
}
import java.util.*;

class Swap {
  public static void main(String[] args) {
    Scanner ntr = new Scanner(System.in);
    float v, l;
    float temp;
    System.out.println("Enter any value for V : ");
    v = ntr.nextFloat();
    System.out.println("Enter any value for L : ");
    l = ntr.nextFloat();
    temp = v;
    v = l;
    l = temp;
    System.out.println("value of V  : " + v + ", value of L : " + l);

  }
}
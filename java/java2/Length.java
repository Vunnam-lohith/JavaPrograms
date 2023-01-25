import java.util.*;

class Length {
  public static void main(String[] args) {
    Scanner ntr = new Scanner(System.in);
    int i = 0, n;
    System.out.println("Enter Any Value :");
    n = ntr.nextInt();
    while (n != 0)
    {
      n = n / 10;
      i++;
    }
    System.out.println("Number of digits: " + i);
  }
}
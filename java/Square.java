import java.util.*;

class Square {
  public static void main(String[] args) {
    Scanner ntr = new Scanner(System.in);
    float n1, n2, sum;
    System.out.println("Enter any value :");
    n1 = ntr.nextFloat();
    System.out.println("Enter any value :");
    n2 = ntr.nextFloat();
    sum = n1 + n2;
    System.out.println("sum of given numbers are : " + sum);
    double Srt = sum * sum;
    System.out.println("sqyareroot value of sum of the given numbers id : " + Srt);
  }
}
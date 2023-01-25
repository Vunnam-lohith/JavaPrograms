import java.util.*;

class Per {
  public static void main(String[] args) {
    Scanner ntr = new Scanner(System.in);
    float s1, s2, s3, s4, s5, s6;
    System.out.println("Enter the marks for maths :");
    s1 = ntr.nextFloat();
    System.out.println("Enter the marks for english :");
    s2 = ntr.nextFloat();
    System.out.println("Enter the marks for science :");
    s3 = ntr.nextFloat();
    System.out.println("Enter the marks for hindi :");
    s4 = ntr.nextFloat();
    System.out.println("Enter the marks for telugu :");
    s5 = ntr.nextFloat();
    System.out.println("Enter the marks for computers :");
    s6 = ntr.nextFloat();

    double total, percentage;
    total = s1 + s2 + s3 + s4 + s5 + s6;
    percentage = (total / 600) * 100;
    System.out.println("PERCENTAGE of the student is :" + percentage);
    if(percentage>90)
      System.out.println("Grade = S");
    else if(percentage>80 && percentage<=90)
      System.out.println("Grade = A");
    else if(percentage>74 && percentage<=80)
      System.out.println("Grade = B");
    else if(percentage>69 && percentage<=74)
      System.out.println("Grade = C");
    else if(percentage>64 && percentage<=69)
      System.out.println("Grade = D");
    else if(percentage>60 && percentage<=64)
      System.out.println("Grade = E");
    else
      System.out.println("Grade = F");
  }
}
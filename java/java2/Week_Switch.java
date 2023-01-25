import java.util.*;
class Week_Switch 
{
  public static void main(String[] args)
  {
    Scanner ntr = new Scanner(System.in);
    System.out.println("Enter a weekday number :");
    int weekday = ntr.nextInt();
    switch (weekday) 
    {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid");
        break;
    }
  }
}
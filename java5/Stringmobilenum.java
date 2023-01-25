import java.util.*;
class Stringmobilenum
{
  public static void main(String args[])
  {
    String mobilenum;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter phone number (10 digits)");
   mobilenum = scanner.nextLine();
   
  
  if(mobilenum.length()==10){
      System.out.println("Your mobile number is correct;");
    }
    else{
      System.out.println("mobile not correct:");
    }
  }
} 
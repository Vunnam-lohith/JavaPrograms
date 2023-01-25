// Complete and execute java Program for making a simple calculator using switch case
import java.util.*;
class Sample2 {

	public static void main(String args[]) 
  {
    Scanner ntr=new Scanner(System.in);

    		//Intialize the char variable below with operators (+, -, *, /) one by one and check the output
    System.out.println("Choose an operator: +, -, *, or /");
    char operator = ntr.next().charAt(0);
    int first=10,second=5,result;
    System.out.println("Enter first number");
    first = ntr.nextInt();

    System.out.println("Enter second number");
    second = ntr.nextInt();
    		
		

    		switch (operator) {
      		case '+':
            
            result = first + second;
            System.out.println(first + " + " + second + " = " + result);
            break;
        	//Write code to perform addition of first and second

      		case '-':
             result = first - second;
             System.out.println(first + " - " + second + " = " + result);
             break;
        	//Write code to perform subtraction 

      		case '*':
             result = first*second;
             System.out.println(first + " * " + second + " = " + result);
             break;
        	//Write code to perform multiplication

      		case '/':
             result = first / second;
             System.out.println(first + " / " + second + " = " + result);
             break;
        	//Write code to perform division

      		//If operator doesn't match any case constant (+, -, *, /)
      		default:
            System.out.println("Invalid operator!");
            break;
        	// Print Error stating operator is not correct
       
    		}

    		//System.out.println(first + " " + operator + " " + second + " = " + result);
  	}
}

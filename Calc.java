package utils;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		char op;
		Double number1, number2, result;
		Scanner in = new Scanner(System.in);
		System.out.println("What operation u want? (+, -, *, /)");
		op = in.next().charAt(0);
		
		System.out.println("First number:");
		number1 = in.nextDouble();
		
		System.out.println("Second number:");
		number2 = in.nextDouble();
		
		// Switch case for operations
		
		switch(op) {
		case '/':
			result = number1 / number2;
			System.out.println(number1+"/"+number2+" : "+result);
			break;
			
		case '*':
			result = number1 * number2;
			System.out.println(number1+"*"+number2+" : "+result);
			break;
			
		case '+':
			result = number1 + number2;
			System.out.println(number1+"+"+number2+" : "+result);
			break;
			
		case '-':
			result = number1 * number2;
			System.out.println(number1+"*"+number2+" : "+result);
			break;
			
		default:
			System.out.println("Not a valid operator");
		}
		
	}

}



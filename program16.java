package September;

import java.util.Scanner;

public class program16{
	//Program of a calculator by entering by the user
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take first number
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();

	        // Take operator
	        System.out.print("Enter operator (+, -, *, /): ");
	        char operator = sc.next().charAt(0);

	        // Take second number
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result = " + result);
	                break;

	            case '-':
	                result = num1 - num2;
	                System.out.println("Result = " + result);
	                break;

	            case '*':
	                result = num1 * num2;
	                System.out.println("Result = " + result);
	                break;

	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result = " + result);
	                } else {
	                    System.out.println("Error! Division by zero.");
	                }
	                break;

	            default:
	                System.out.println("Invalid operator!");
	                break;
	        } 
	   }
}
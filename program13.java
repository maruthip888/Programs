package September;

import java.util.Scanner;

public class program13 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        // swap logic
	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
	}

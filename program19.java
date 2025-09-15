package September;

import java.util.Scanner;

public class program19 {
//program to print the multiplication table
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number for its table: ");
	        int num = sc.nextInt();

	        System.out.println("Multiplication table of " + num + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	    }
	}


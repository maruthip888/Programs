package September;

import java.util.Scanner;

public class program17 {
//Program of the Simple interest calculator by entering value from the user
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter principal amount: ");
	        double p = sc.nextDouble();

	        System.out.print("Enter rate of interest (in %): ");
	        double r = sc.nextDouble();

	        System.out.print("Enter time (in years): ");
	        double t = sc.nextDouble();

	        double si = (p * r * t) / 100;
	        System.out.println("Simple Interest = " + si);

	        sc.close();
	    }
	}



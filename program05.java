package September;

import java.util.Scanner;

public class program05 {
//Roots of the Quadratic Equation 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		        System.out.print("Enter a: ");
		        double a = input.nextDouble();
		        System.out.print("Enter b: ");
		        double b = input.nextDouble();
		        System.out.print("Enter c: ");
		        double c = input.nextDouble();

		        double discriminant = b * b - 4 * a * c;

		        if (discriminant > 0) {
		            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
		            System.out.println("Two real and distinct roots: " + root1 + " and " + root2);
		        } else if (discriminant == 0) {
		            double root = -b / (2 * a);
		            System.out.println("Two real and equal roots: " + root);
		        } else {
		            double realPart = -b / (2 * a);
		            double imagPart = Math.sqrt(-discriminant) / (2 * a);
		            System.out.println("Complex roots: " + realPart + " ± " + imagPart + "i");
		        }

	}

}

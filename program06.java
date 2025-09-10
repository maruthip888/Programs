package September;

import java.util.Scanner;

public class program06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		        // Input length, breadth, height
		        System.out.print("Enter length: ");
		        double length =input .nextDouble();

		        System.out.print("Enter breadth: ");
		        double breadth = input.nextDouble();

		        System.out.print("Enter height: ");
		        double height = input.nextDouble();

		        // Total Surface Area
		        double totalSurfaceArea = 2 * (length * breadth + breadth * height + height * length);

		        // Lateral Surface Area
		        double lateralSurfaceArea = 2 * height * (length + breadth);

		        // Volume
		        double volume = length * breadth * height;

		        // Output
		        System.out.println("Total Surface Area is : " + totalSurfaceArea);
		        System.out.println("Lateral Surface Area is : " + lateralSurfaceArea);
		        System.out.println("Volume is : " + volume);
	}

}

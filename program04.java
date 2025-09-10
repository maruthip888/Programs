package September;

import java.util.Scanner;

public class program04 {
	//Area of the triangle
	public static void Area() {
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();
		double area = base * height /2;
		System.out.println("The area of thr triangle is : "+area);
	}
	public static void main(String[] args) {
		Area();
	}

}

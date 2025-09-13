package September;

public class program09 {
	public static  void displayValue() {
		System.out.println("The Square of the two number is :");
		square(8);
		
	}
	public static void square(int a) {
		System.out.println(a*a);
		cube(2);
	}
	public static void cube(int a) {
		System.out.println(a*a*a);
	}
	public static void main(String[] args) {
		displayValue();
	}

}

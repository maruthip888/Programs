package September;

public class program02 {
//How to convert decimal to Binary
	public static void main(String[] args) {
		//unsigned number
		int decimalNumber1=5;
		System.out.println(Integer.toBinaryString(decimalNumber1));
		
		//if the number is signed
		int decimalNumber2 = -5;
		System.out.println(Integer.toBinaryString(decimalNumber2));
	}

}

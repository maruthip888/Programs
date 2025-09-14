package September;
import java.util.Scanner;
public class program12 {
	    static int fib(int n) {
	        if (n <= 1) return n;
	        return fib(n - 1) + fib(n - 2);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();

	        System.out.println("Fibonacci series:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fib(i) + " ");
	        }
	    }
	}



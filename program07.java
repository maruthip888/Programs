package September;

public class program07 {
//Increment and Decrement
	public static void main(String[] args) {
		//Increment
		int x = 5;
		int y;
		//post increment
		y=x++;
		System.out.println("The Post increment Value is : "+y);
		
		int a=5;
		int b;
		//pre increment
		b=++a;
		System.out.println("The Pre increment Value is : "+b);
	System.out.println("--------------------------------------------");
	
		//Decrement
		int p=5;
		//post decrement
		int q=p--;
		System.out.println("The Post decrement Value is : "+q);
		//pre decrement
		int u=8;
		int v=--u;
		System.out.println("The Pre decement Value is : "+v);
		
		//Some of the problems are
		int m=2,n=5,o=4;
		int c=m*n++ +b;
		System.out.println("the Answer is : "+c);
		
		//Some of the problems 
		int i=5,j=4,z;
		z=2*x++ +3* ++y;
		System.out.println("Answer is : "+z);
			}

}

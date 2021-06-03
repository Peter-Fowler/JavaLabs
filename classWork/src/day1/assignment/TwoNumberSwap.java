package day1.assignment;

public class TwoNumberSwap {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 20;
		
		System.out.println("a is: " + a + "\nb is: " + b);
	
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a is: " + a + "\nb is: " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a is: " + a + "\nb is: " + b);
	}

}

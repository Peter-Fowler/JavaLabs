package day2.lavAndAssignment;

import java.util.Scanner;

public class FibonacciForLoop {

	public static void main(String[] args) {

		int fibNumber;
		Scanner input = new Scanner(System.in);

		System.out.println("How many Fibonacci numbers would you like to see: ");

		fibNumber = input.nextInt();

		for (int i = 1, a = 1, b = 0, c = 0; i <= fibNumber; i++) {

			if (i % 7 == 0) {
				System.out.println(a + "\t");
				c = b + a;
				b = a;
				a = c;

			} else {
				System.out.print(a + "\t");
				c = b + a;
				b = a;
				a = c;

			}
		}

		input.close();
	}

}

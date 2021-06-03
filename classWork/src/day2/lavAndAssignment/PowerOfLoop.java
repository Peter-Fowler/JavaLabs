package day2.lavAndAssignment;

import java.util.Scanner;

public class PowerOfLoop {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int answer =1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number and its power: ");
		
		num1 = input.nextInt();
		
		num2 = input.nextInt();
		
		for (int temp = num2; temp != 0; temp--) {
			answer *= num1;
		}
		System.out.println(num1 + "^" + num2 + " = " + answer);

		input.close();
	}

}

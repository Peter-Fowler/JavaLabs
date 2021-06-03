package day2.lavAndAssignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		int reverce = 0;
		
		System.out.println("Enter number: ");

		num = input.nextInt();	
		
		
		while (num != 0) {
			
			int temp = num % 10;
			reverce = reverce * 10 + temp;
			num /= 10;
		}
		
		System.out.println(reverce);

		input.close();
	}

}

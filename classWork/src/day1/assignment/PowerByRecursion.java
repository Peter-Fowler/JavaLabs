package day1.assignment;

import java.util.Scanner;

public class PowerByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num;
		int power;

		System.out.println("Enter the number to be raised:");
		
		num = input.nextInt();

		System.out.println("Enter the number to be the power:");
		
		power = input.nextInt();
		
		int output = powerRecursion(num, power);
		
		System.out.println(num + "^" + power + " = " + output);
		
		input.close();
	}

	public static int powerRecursion(int num, int power){
		if( power != 0) {
			return (num * powerRecursion(num, power - 1));
		}else 
			return 1;
		
	}
}

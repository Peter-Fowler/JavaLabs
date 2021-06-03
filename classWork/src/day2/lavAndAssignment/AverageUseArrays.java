package day2.lavAndAssignment;

import java.util.Scanner;

public class AverageUseArrays {

	public static void main(String[] args) {
		
		double[] nums = new double[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers: ");

		for(int i = 0; i < nums.length; i++) {
		nums[i] = input.nextDouble();
		}
		
		System.out.println("The average is: " + Average(nums));
	
	input.close();
	}
	
	public static double Average(double[] numbers) {
		double average = 0;
		double sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = sum / numbers.length;
		
		return average;
	}
}

package day1.assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i;
		int i2;
		int count = 0;
		
		System.out.println("Enter a whole number:");
		
		i = input.nextInt();
		
		System.out.println("Enter another whole number:");
		
		i2 = input.nextInt();
		
		if(i < i2) {
			int temp = i;
			i = i2;
			i2 = temp;
		}
		int temp;
		if(i2 < 2)
			temp = 2;
		else 
			temp = i2;
		
		for (int j = temp; j <= (i/2); j++) {
			boolean prime = true;
			for (int c = 2; c <= (j/2); c++) {
				if (j % c == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				if (count % 10 == 0 && count != 0) {
				System.out.println(j + " ");
				count++;
				}else {
					System.out.print(j + " ");
				count++;
				}
		}
		}

		input.close();
	}

}

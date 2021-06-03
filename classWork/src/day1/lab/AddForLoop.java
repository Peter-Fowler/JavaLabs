package day1.lab;

public class AddForLoop {

	public static void main(String[] args) {

		int sumOfNumbers = 0;
		
		for (int i = 1; i <= 10; i++) {
			sumOfNumbers += i;
		}
		System.out.println("The sum of the numbers in between 1 and 10 are: " + sumOfNumbers + "\n");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0 && i > 1) {
				System.out.println();
			}
			System.out.print("5 X " + i + " = " + (i*5) + "       ");
		}
		System.out.println("\n");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

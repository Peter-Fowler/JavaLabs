package day2.lavAndAssignment;

public class MultiplicationTable {

	public static void main(String[] args) {
		int count = 1;
		
		for(int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(count % 5 == 0) {
					System.out.println(i + " X " + j + " = " + i * j + "\t");
					count++;
				}else {
				System.out.print(i + " X " + j + " = " + i * j+ "\t");
				count++;
				}
			}
		}
	}
}

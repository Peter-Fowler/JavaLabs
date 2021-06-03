package day2.lavAndAssignment;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums1 = new int[][] {{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10}};
		
		int[][] nums2 = new int[][] {{20, 21, 23, 24, 25},
			{26, 27, 28, 29, 30}};
		
		int[][] sum = new int[nums1.length][nums1[0].length];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				sum[i][j] = nums1[i][j] + nums2[i][j];
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(nums1[i][j] + " + " + nums2[i][j] + " = " + sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

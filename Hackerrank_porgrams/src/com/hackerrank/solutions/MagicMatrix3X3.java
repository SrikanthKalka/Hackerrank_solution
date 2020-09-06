package com.hackerrank.solutions;
import java.util.Scanner;

public class MagicMatrix3X3 {

	 static final int[][][] ALL_MAGIC_MATRICES = { 
			{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
			{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
			{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
			{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
			{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
			{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
			{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
			{ { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } } };

	public static void main(String[] args) {

		System.out.println("Please enter 3*3 Matrix: ");
		
		Scanner sc = new Scanner(System.in);

		int[][] input = new int[3][3];

		for (int x = 0; x < 3; x++) {

			for (int y = 0; y < 3; y++) {

				input[x][y] = sc.nextInt();
			}
		}

		sc.close();
		
		int result = Integer.MAX_VALUE; //10

		int difference = 0; //5

		for (int[][] matrix : ALL_MAGIC_MATRICES) {

			for (int x = 0; x < 3; x++) {

				for (int y = 0; y < 3; y++) {
					
					System.out.println("Calculation: " + matrix[x][y] +" - "+ input[x][y] );
					
					difference += Math.abs(matrix[x][y] - input[x][y]);
					
					System.out.println("Difference:" + difference);

				}
			}
			result = Math.min(difference, result);
			difference = 0;
			
			System.out.println("=================================");
		}

		System.out.println(result);
	}
}

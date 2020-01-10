package easy;

import java.util.Scanner;

public class ModifyMatrix {

	public static int QueryRow(int[][] M, int i) {
		int sumValues = 0;
		// Given matrix M, output the sum of values in row i
		for (int column = 0; column < M.length; column++) {
			sumValues += M[i][column];
		}
		return sumValues;
	}

	public static int QueryCol(int[][] M, int j) {
		int sumValues = 0;
		// Given matrix M, output the sum of the values on column j
		for (int row = 0; row < M.length; row++) {
			sumValues += M[row][j];
		}
		return sumValues;
	}

	public static void main(String[] args) {
		int[][] M = new int[255][255];

		while (true) {
			Scanner input = new Scanner(System.in); // Create a Scanner object
			String hold = input.nextLine();

			String[] tokens = hold.split("\\s+");

			String firstPart = tokens[0];

			if (firstPart.equals("QueryCol")) {
				System.out.println(QueryCol(M, Integer.parseInt(tokens[1])));
			} else if (firstPart.equals("QueryRow")) {
				System.out.println(QueryRow(M, Integer.parseInt(tokens[1])));
			} else if (firstPart.equals("SetRow")) {
				for (int column = 0; column < M.length; column++) {
					M[Integer.parseInt(tokens[1])][column] = Integer.parseInt(tokens[2]);
				}
			} else if (firstPart.equals("SetCol")) {
				for (int row = 0; row < M.length; row++) {
					M[row][Integer.parseInt(tokens[1])] = Integer.parseInt(tokens[2]);
				}
			}
		}

	}

}

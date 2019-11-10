package easy;

import java.util.Scanner;

public class StarTriangle {
	
	public static void startTriangle() {
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		startTriangle();	
	}

}
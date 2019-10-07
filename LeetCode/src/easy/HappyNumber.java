package easy;

import java.util.Scanner;

public class HappyNumber {

	public static boolean isHappy() {

		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter an int. If it's a happy number, this program will return true:)");
		int num = scannerObject.nextInt();

		int result = 0;
		int sum = 0;

		while (result != 1) {
			sum = (int) (sum + Math.pow(num % 10, 2));
			if (num / 10 != 0) {
				num = num / 10;
			} else if (num / 10 == 0) {
				result = sum;
				num = sum;
				sum = 0;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isHappy());
	}
}
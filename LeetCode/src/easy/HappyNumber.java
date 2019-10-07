package easy;

import java.util.Scanner;

public class HappyNumber {

	public static boolean isHappy() {

		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter an int. If it's a happy number, this program will return true:)");
		int num = scannerObject.nextInt();
		
		int sum = 0;
		while (sum !=1) {
			if (num==0)
			{
				num=sum;
				sum=0;
			}
			sum += (int) (Math.pow(num%10, 2));
			num /= 10;
			System.out.println(sum+" "+num);
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isHappy());
	}
}
package easy;

import java.util.Arrays;

public class BinarySearch {
	
	public static boolean binarySearchArr(int[] arr, int val) {
		int left = 0; 
		int right = arr.length-1;
		
		while (left <= right) {
			int middleIndex = left + ((right - left) / 2);
			if (arr[middleIndex] == val) {
				return true;
			}
			else if (arr[middleIndex] > val) {
				right = middleIndex - 1;
			}
			else {
				left = middleIndex + 1;
			}
		}
		return false;
	}
	
	public static boolean binarySearchString(char[] str, char val) {
		int left = 0; 
		int right = str.length - 1;
		
		while (left <= right) {
			int middleIndex = left + ((right - left) / 2);
			if (str[middleIndex] == val) {
				return true;
			}
			else if (str[middleIndex] > val) {
				right = middleIndex - 1;
			}
			else {
				left = middleIndex + 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[20];
		int pointer = 0;
		for (int i = 0; i < 40; i+=2) {
			arr[pointer] = i;
			pointer++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(binarySearchArr(arr, 20));
		
		String s = "hellotherehihihihihiakdksa;fjlkdsajflkd;sjflak;s";
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
		System.out.println(binarySearchString(temp, 'z'));
	}

}

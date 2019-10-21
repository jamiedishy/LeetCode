package easy;

import java.util.Arrays;

public class OneBitCharacter {
	
	public static boolean isOneBitChar(int[] bits) {
		if (bits.length == 0) { //base case
			return false;
		}
     	if (bits.length == 1) { //base case
			if (bits[0] == 0) {
				System.out.println(Arrays.toString(bits));
				return true;
			}
			else {
				return false;
			}
		}
		if (bits[0] == 1) {
			return isOneBitChar(Arrays.copyOfRange(bits, 2, bits.length));	
		}
		else {
			return isOneBitChar(Arrays.copyOfRange(bits, 1, bits.length));
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1, 1, 1, 1, 0};
		System.out.println(isOneBitChar(a));
	}
}

package dailyCoding;

public class Day7 {
//	This problem was asked by Facebook.
//	Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
//	For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
//	You can assume that the messages are decodable. For example, '001' is not allowed.

	public static int decodeWay(String number) {
		int[] dp = new int[number.length() + 1];
		dp[0] = 1; // WHY
		if (number.charAt(0) == '0') {
			return 0;
		} else {
			dp[1] = 1;
		}

		for (int i = 2; i < number.length() + 1; i++) {
			if (number.charAt(i - 1) == '0') {
				if (number.charAt(i - 2) == '1' || number.charAt(i - 2) == '2') {
					dp[i] = dp[i - 2];
				} else {
					return 0;
				}
			} else {
				if (number.charAt(i - 2) == '1') {
					dp[i] = dp[i - 2] + dp[i - 1];
				} else if (number.charAt(i - 2) == '2' && Character.getNumericValue(number.charAt(i-1)) < 7) {
					dp[i] = dp[i - 2] + dp[i - 1];
				} else {
					dp[i] = dp[i - 1];
				}
			}
		}
		return dp[number.length()];
	}

	public static void main(String[] args) {
		System.out.println(decodeWay("2611"));
	}
}

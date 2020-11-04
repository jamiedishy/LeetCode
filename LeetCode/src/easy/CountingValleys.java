package easy;

public class CountingValleys {

	public static int countValleys(int n, String s) {
		int count = 0;
		int height = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'D') {
				height = height - 1;
			} else {
				height = height + 1;
				if (height == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String path = "DDUUUUDD";
		System.out.println(countValleys(8, path));
	}
	

}

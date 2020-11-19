package easy;

public class addOccurrenceOfZeros {

	public int zeroOccurrence(int[] a) { // o(m*n)
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			String temp = Integer.toString(a[i]);
			int countZ = 0;
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == '0') {
					countZ++;
				}
			}
			if (countZ % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = { 4, 50, 100, 65, 20009, 700, 1, 10 };
		addOccurrenceOfZeros c = new addOccurrenceOfZeros();
		System.out.println(c.zeroOccurrence(a));
	}
}

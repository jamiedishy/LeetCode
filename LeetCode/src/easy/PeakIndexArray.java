package easy;

public class PeakIndexArray {
	
	public static int peakIndex(int[] a) {
		int index = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] example = {0,2,3,1,0,330};
		System.out.println(peakIndex(example));
	}
}

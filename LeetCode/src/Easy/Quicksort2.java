package Easy;

public class Quicksort2 {

	static int[] array1 = { 5, 2, 7, 4, 3, 1, 6 };

	public static int[] quicksort(int beg, int end) { // beg=0, end=arraylength-1
		int pivot = array1.length / 2;
		// base case
		if (array1.length <= 3) {
			if (array1[beg] > array1[pivot] && array1[end] > array1[pivot]) {
				int a = array1[beg];
				array1[beg] = array1[pivot];
				array1[pivot] = a;
			}
			if (array1[beg] > array1[pivot] && array1[end] < array1[pivot]) {
				int b = array1[beg];
				array1[beg] = array1[end];
				array1[end] = b;
			}
		}
		if (array1.length > 3) {
			if (array1[beg] > array1[pivot]) {
				for (int i = pivot + 1; i < array1.length; i++) {
					if (array1[i] < array1[pivot]) {
						int c = array1[i];
						array1[i] = array1[beg];
						array1[beg] = c;
					}
					beg++;
				}
			} 
			else if (array1[beg] < array1[pivot]) {
				beg++;
			}
			//quicksort(beg, pivot - 1);
		//	quicksort(pivot + 1, end);
		}
		return array1;
	}

	public static void main(String[] args) {
		quicksort(0, array1.length - 1);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
}

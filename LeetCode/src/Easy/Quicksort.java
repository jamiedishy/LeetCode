package Easy;
// before i created new object arrays and set them equal to recursion of less subarray and greater subarray
// confusing to recurse on subarrays and then put them all together... better to create points (ie beg and end)
// and then use them to keep track of array1. this way when you recurse, you don't need to add any arrays together
// TEST

public class Quicksort {

	static int[] array1 = {7, 2, 1, 8, 6, 3, 5, 4};

	public static int[] sort(int beg, int end) {
		// base case
		if (end - beg + 1 == 2) {
			if (array1[beg] > array1[end]) {
				int a = array1[beg];
				array1[beg] = array1[end];
				array1[end] = a;
			}
		}
		if (end - beg + 1 > 2) {
			int pivot = array1[end]; // I created the pivot
            // for loop to sort the array according to the pivot value
			int i = beg-1;
			for (int j = beg; j <= end; j++) {
				if (array1[j] < pivot) {
					i++;
					int placeholder = array1[i]; // storing initial value of i, i = 7
					array1[i] = array1[j]; // i now has the low value of j value, i = 2
					array1[j] = placeholder; // j now has the large initial value of i, j=7
				} else if (array1[j] == pivot) { // eg array at j is 4
					array1[j] = array1[i + 1];
					array1[i + 1] = pivot; // pivot isnt at the end anymore
				}
			}
			sort(beg, i);
			sort(i+2, end);
		}
		return array1;
	}
	public static void main(String[] args) {
		sort(0, array1.length-1);
		for ( int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
	}
}

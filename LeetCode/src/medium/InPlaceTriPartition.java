package medium;

public class InPlaceTriPartition {
	// return number of pairs of socks such that each pair is the same colour
	// first, sort the array so that all same-coloured socks are side-by-side
	// then, count the number of pairs and return count
	// O(n) time
	
	// let red socks be 4
	// let green socks be 2
	// let blue socks be 3
	
	public static int sortArraySections(int[] x) {
		int count = 0;
		int red = 0;
		int green = 1;
		int blue = x.length-1;
		
		// sorts the socks according to their given colours
		while (green <= blue) {
			if (x[green] == 2) {
				green++;
			}
			else if (x[green] == 3) {
				x[green] = x[blue];
				x[blue] = 3;
				blue--;
			} 
			else {
				x[green] = x[red];
				x[red] = 4;
				red++;
				green++;
			}
		}
		
		count = (red/2) + ((green+1-red)/2) + (((x.length)-blue)/2);
		return count;
	}
	
	public static void main(String[] args) {
		int[] a = {2, 4, 3, 2, 3, 4};
		System.out.println(sortArraySections(a));
	}
}

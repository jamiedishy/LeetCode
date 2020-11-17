package dailyCoding;

import java.util.Arrays;
import java.util.Random;

public class Day15 {
	
	public void reservoirSampling(int[] stream, int n, int k) {
		int i;
		int[] reservoir = new int[k];
		
		for (i = 0; i < k; i++) {
			reservoir[i] = stream[i];
		}
		
		Random r = new Random();
		
		// iterate from (k+	1)th element to nth element
		// after each iteration, the jth element of the reservoir array is chosen to be replaced with probability 1/k * k/i = 1/k
		// after execution, each item in the input population has equal probability (k/n) of being chosen for the reservoir
		for (; i < n; i++) {
			int j = r.nextInt(i+1); // pick pseudorandom j from 0 to i
			if (j < k) {
				reservoir[j] = stream[i];
			}
		}
		
		System.out.println("Following are k randomly selected items... these are the randomly selected items placed in our reservoir because the stream is too big to store all elements from stream in memory");
		System.out.println(Arrays.toString(reservoir));
	}
	
	public static void main(String[] args) {
		int[] stream = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 
		int n = stream.length;
		int k = 5;
		Day15 c = new Day15();
		c.reservoirSampling(stream, n, k);
	}

}

package easy;

import java.util.Arrays;

public class mutateArray {
	
	public static int[] mutateTheArray(int n, int[] a) {
	    int added = 0;
	    int[] b = new int[n];
	    
	    if (n == 1) {
	    	b = a;
	    }
	    for (int i = 0; i < n; i++) {
	        if (i-1 < 0) {
	        	added = 0 + a[i] + a[i+1];
	        	b[i] = added;
	        } 
	        else if (i+1 >= n) {
	        	added = a[i-1] + a[i] + 0;
	        	b[i] = added;
	        }
	        else
	        {
	        added = a[i-1] + a[i] + a[i+1];
	        b[i] = added;
	        }
	    }
	    System.out.println(Arrays.toString(b));
	    return b;

	}
	public static void main(String[] args) {
	    int[] hello = {4, 0, 1, -2, 3};
	    System.out.println(mutateTheArray(5, hello));
	}


}

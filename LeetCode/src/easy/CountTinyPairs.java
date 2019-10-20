package easy;

public class CountTinyPairs {
	
	public static int countTinyPairs(int[] a, int[] b, int k) {
	    int j = b.length-1;
	    int counter = 0;
	    int tiny = 0;
	    
	    for (int i = 0; i < a.length; i++) {
	    	tiny = Integer.parseInt(Integer.toString(a[i]) + Integer.toString(b[j]));
	        if (tiny < k) {
	            counter++;
	        }
	        j--;
	    } 
	    return counter;
	}
	public static void main(String[] args) {
	}

}

package easy;

import java.util.HashMap;
import java.util.Iterator;

public class SockMerchant {
	
	    public static int sockMerchant(int n, int[] ar) {
	        int result = 0;
	        
	        HashMap<Integer, Integer> map =  new HashMap<>();
	        for (int i = 0; i < ar.length; i++) {
	            if (map.containsKey(ar[i])) {
	                map.replace(ar[i], map.get(ar[i]), map.get(ar[i])+1);
	            }
	            else {
	                map.put(ar[i], 1);
	            }
	        }
	        
	        Iterator iterator = map.values().iterator();
	        while (iterator.hasNext()) {
	            result = result + (Integer) iterator.next()/2;
	        }
	        return result;
	    }

	    public static void main(String[] main) {
	    	int[] ar = {1, 2, 1, 2, 1, 3, 2};
	    	System.out.println(sockMerchant(7, ar));
	    }
}

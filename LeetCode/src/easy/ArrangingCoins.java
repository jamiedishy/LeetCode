package easy;

public class ArrangingCoins {
	public int arrangeCoins(int n) {
        // the sorted array is the rows
        // rather than array[mid] == N, we need (k(k+1))/2 <= N
        // left = 0, right = n which in my example is 10
        
        int left = 0;
        int right = n;
        
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            int curr = (mid * (mid + 1)) / 2;
            if (curr == n) {
                return mid;
            }
            else if (curr < n) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return right;
    }
}

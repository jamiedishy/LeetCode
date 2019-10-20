package easy;

public class RobberSum {
	
	static int[] cashPerHouse = {3, 7, 1, 2, 4};
	
	public static int cashSum(int[] A) {
		
		int sumEven = 0;
		int sumOdd = 0;
		
		if (A.length % 2 == 0) {
			int j = 0;
			for (int i = 1; i < A.length; i=i+2) {
				sumOdd += A[i];
				sumEven += A[j];
				j += 2;
			}
		}
		else {
			int i = 0;
			for (int j = 1; j < A.length; j=j+2) {
				sumEven += A[j];
				sumOdd += A[i];
				i += 2;
			}
		}
		return Math.max(sumEven, sumOdd);
	}
	
	public static void main(String[] args) {
		System.out.println(cashSum(cashPerHouse));
	}

}

package easy;

public class JumpingOnClouds {

	public static int cloudJumps(int[] A) {
		int jumps = 0;
		int originalCloudPosition = 0;
		int possibleCloudPosition = 2;

		if (A.length < 4) {
			jumps = 1;
		} else {
			while (possibleCloudPosition < A.length) {
				if (A[possibleCloudPosition] == 1) {
					originalCloudPosition ++;
					possibleCloudPosition ++;
					jumps++;
				} else {
					originalCloudPosition = possibleCloudPosition;
					if (possibleCloudPosition + 2 >= A.length) {
						possibleCloudPosition += 1;
					} else {
						possibleCloudPosition += 2;
					}
					jumps++;
				}
			}
		}
		return jumps;
	}

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 1, 0, 0, 1, 0 };
		System.out.println(cloudJumps(a));

	}

}

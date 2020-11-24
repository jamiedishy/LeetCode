package dailyCoding;

public class Day21 {
//	This problem was asked by Snapchat.
//	Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.
//	For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

	public int minRooms(int[][] intervals) {
		int rooms = 1;
		int i = 0;
		int j = 1;
		if (intervals.length == 0) {
			rooms = 0;
			return rooms;
		}
		while (j < intervals.length) {
			if (intervals[i][1] > intervals[j][0]) {
				rooms++;
				j++;
			} else {
				i++;
				if (rooms != 1) {
					rooms--;
				}
				if (i == j) {
					j++;
				}
			}
		}
		return rooms;

	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 50 }, { 30, 75 }, { 60, 150 }, { 100, 160 }, { 130, 170 } };
		int[][] arr2 = { { 0, 500 }, { 51, 60 }, { 76, 150 } }; // bug
		Day21 c = new Day21();
		System.out.println(c.minRooms(arr2));
	}
}

package HackerRank;

import java.util.Arrays;
import java.util.List;

public class Elevator {

	public static int elevatorCount(int[] weightList, int[] floorList, int weightCapacity, int numberCapacity, int maxFloor) {
		int count = 0;
		int weightSum = 0;
		int personCount = 0;
		List<Integer> floors = Arrays.asList(new Integer[maxFloor + 1]);
		for (int i = 0; i < floors.size(); i++) { // set all values in list to 0
			floors.set(i, 0);
		}
		
		for (int i = 0; i < weightList.length; i++) {
			weightSum += weightList[i];
			personCount++;
			floors.set(floorList[i], floors.get(floorList[i])+ 1);

			if (weightSum <= weightCapacity && personCount <= numberCapacity && floors.get(floorList[i]) <= 1) {
				count++;
				personCount++;
			}
			else if (weightSum > weightCapacity || personCount > numberCapacity) {
				count += 2; // return to floor 1
				weightSum = weightList[i];
				personCount = 1;
			}
		}
		return count+1; // return back to floor 1 at end
	}
	
	public static void main(String[] args) {
		int[] weightList = {10, 20, 30, 40, 50};
		int[] floorList = {5, 4, 2, 2, 7};
		int weightCapacity = 10;
		int numberCapacity = 10;
		int maxFloor = 7;
		System.out.println(elevatorCount(weightList, floorList, weightCapacity, numberCapacity, maxFloor));
	}
}

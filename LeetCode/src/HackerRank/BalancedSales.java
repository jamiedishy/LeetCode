package HackerRank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalancedSales {
	
	public static int balancedSum(List<Integer> sales) {
		int currentIndexPointer = 0;
		int leftRunningSum = 0;
		int rightIndexPointer = 0;
		int rightRunningSum = sales.get(rightIndexPointer);
		
		if (sales.size() == 1) {
			return currentIndexPointer;
		}

		else {
		while (rightIndexPointer < sales.size()) {
			if (leftRunningSum < rightRunningSum) {
				leftRunningSum += sales.get(currentIndexPointer);
				currentIndexPointer++;
				rightIndexPointer = currentIndexPointer + 1;
				rightRunningSum = sales.get(rightIndexPointer);
			}
			else if (rightRunningSum < leftRunningSum && rightIndexPointer < sales.size()-1) {
				rightIndexPointer++;
				rightRunningSum += sales.get(rightIndexPointer);
			}
			else if (rightRunningSum == leftRunningSum && rightIndexPointer == sales.size()-1) {
				return currentIndexPointer;
			}
			else if (rightRunningSum == leftRunningSum && rightIndexPointer < sales.size()-1) {
				leftRunningSum += sales.get(currentIndexPointer);
				currentIndexPointer++;
				rightIndexPointer = currentIndexPointer + 1;
				rightRunningSum = sales.get(rightRunningSum);
			}
		}	
	}	
		return currentIndexPointer;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 13);
		System.out.println(balancedSum(list));
	}

}

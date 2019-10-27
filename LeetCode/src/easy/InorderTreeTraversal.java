package easy;

import java.util.ArrayList;

public class InorderTreeTraversal {
	
	public static ArrayList<Integer> inorderTraversal(int[] tree, int index) {
		ArrayList<Integer> array = new ArrayList<>();
		
		if (index*2+1 <= tree.length && tree[index*2] == -1 && tree[index*2+1] == -1 && tree[index] != -1) 
		{
			array.add(tree[index]);
			return array;
		}
		else if (index*2 > tree.length && index < tree.length && tree[index] != -1) 
		{
			array.add(tree[index]);
			return array;
		}
		else if (index < tree.length && tree[index] == -1) 
		{
			return array;
		}
		else if (index >= tree.length)
		{
			return array; // don't add anything to array, just return
		}
		else // recursive definition
		{	
			array.addAll(inorderTraversal(tree, index*2));
			array.add(tree[index]);
			array.addAll(inorderTraversal(tree, index*2+1));
			return array;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {-1, 1, 2, 3, 4, 5, -1, 7, -1, -1, -1, -1, -1, -1, 8};
		System.out.println(inorderTraversal(a, 1).toString());
	}

}
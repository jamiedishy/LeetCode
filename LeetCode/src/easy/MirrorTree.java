package easy;



public class MirrorTree {
	
	public static Integer[] treeArray = {1, 2, 2, 3, 4, 4, null};
	public static int i = 1;
	public static int j = 2;
	
	public static boolean isSymmetric(Integer[] root) {
		if (root[0] == null) {
			return true;
		}
		
        return isMirror(root[i], root[j]);
    }
	
	public static boolean isMirror(Integer t1, Integer t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		if (!t1.equals(t2)) {
			return false;
		}
		
		int iRight = 2 * (i + 1);
		i = 2 * i + 1;
		
		int jLeft = 2 * j + 1;
		j = 2 * (j + 1);
		
		return ((i | j | iRight | jLeft) > treeArray.length-1) ? isMirror(null, null) && isMirror(null, null) : isMirror(treeArray[i], treeArray[j]) && isMirror(treeArray[iRight], treeArray[jLeft]);
	}
	

	public static void main(String[] args) {
		System.out.println(isSymmetric(treeArray));
	}

}

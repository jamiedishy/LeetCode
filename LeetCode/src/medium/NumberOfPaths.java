package medium;


public class NumberOfPaths {
	
	public static int countPaths(int n, int m)
    {
//		System.out.println("value of n and m " + n + " " + m);
        // If we reach bottom or top left, we are
        // have only one way to reach (0, 0)
        if (n == 0 || m == 0)
            return 1;
        // Else count sum of both ways
        return (countPaths(n - 1, m) + countPaths(n, m - 1));
    }
	
	public static int dpCountPaths(int n, int m) {
		int dp[][] = new int[n + 1][m + 1];
	     
        // Fill entries in bottommost row and leftmost
        // columns
        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;
        for (int i = 0; i <= m; i++)
            dp[0][i] = 1;
     
        // Fill DP in bottom up manner
        for (int i = 1; i <= n; i++)
        for (int j = 1; j <= m; j++)
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
     
        return dp[n][m];
     
	}
	
     
    // Driver Code
    public static void main (String[] args)
    {
        int n = 3, m = 2;
        System.out.println (" Number of Paths "
                            + countPaths(n, m));
        
        System.out.println(dpCountPaths(n,m));
         
    }

}

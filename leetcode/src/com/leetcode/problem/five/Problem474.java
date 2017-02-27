package com.leetcode.problem.five;

/**
 * Ones and Zeroes
 * @author ln
 *
 */
public class Problem474 {
	public int findMaxForm(String[] strs, int m, int n) {
    int[][] dp = new int[m+1][n+1];
    for (String s : strs) {
        int oneCount = getOneCount(s);
        int zeroCount = s.length() - oneCount;
        for (int i=m;i>=zeroCount;i--) 
            for (int j=n;j>=oneCount;j--) 
                dp[i][j] = Math.max(1 + dp[i-zeroCount][j-oneCount], dp[i][j]);
    }
    return dp[m][n];
	}
	
	
	
	public int getOneCount(String s){
	    int res = 0;
	    for(char c : s.toCharArray()) {
	        if(c=='1') res++;
	    }
	    return res;
	}
}

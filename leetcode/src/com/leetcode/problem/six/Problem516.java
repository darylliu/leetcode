package com.leetcode.problem.six;

/**
 * Longest Palindromic Subsequence
 * @author ln
 *
 */
public class Problem516 {
	public int longestPalindromeSubseq(String s) {
    return isLongestPalindromeSubseq(s, 0, s.length()-1, new int[s.length()][s.length()]);
	}
	
	public int isLongestPalindromeSubseq(String s, int i, int j, int[][] dp){
	    if(dp[i][j]!=0) return dp[i][j];
	    if(i>j) return 0;
	    if(i == j) return 1;
	    if(s.charAt(i) == s.charAt(j)){
	        dp[i][j] = isLongestPalindromeSubseq(s, i+1, j-1, dp) + 2;
	    }
	    else{
	        dp[i][j] = Math.max(isLongestPalindromeSubseq(s, i+1, j, dp), isLongestPalindromeSubseq(s, i, j-1, dp));
	    }
	    return dp[i][j];
	}
}

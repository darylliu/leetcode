package com.leetcode.problem.four;

/**
 * Integer Break
 * @author ln
 *
 */
public class Problem343 {
	public int integerBreak(int n) {
    if(n==1||n==0) return n;
    if(n==2) return 1;
    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3; i<n+1; i++){
        int max = 1;
        int j=i-1;
        while(j-->=1){
            if((i-j)*dp[j]>max) {
                max = (i-j)*dp[j];
            }
            if(i/2*i/2>max){
                max = i/2*i/2;
            }
        }
        dp[i] = max;
    }
    return dp[n];
	}
}

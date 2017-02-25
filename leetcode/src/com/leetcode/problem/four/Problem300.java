package com.leetcode.problem.four;

/**
 * Longest Increasing Subsequence
 * @author ln
 *
 */
public class Problem300 {
	public int lengthOfLIS(int[] nums) {
    if(nums.length <=1) return nums.length;
    int[] dp = new int[nums.length];
    
    int res = 0;
    for(int i=1; i<nums.length; i++){
        for(int j=i-1; j>=0; j--){
            if(nums[j]<nums[i]) {
                dp[i] = dp[j]+1 > dp[i] ? dp[j]+1 : dp[i];
                
            }
        }
        res = dp[i] > res? dp[i]:res;
    }
    return res+1;
	}
}

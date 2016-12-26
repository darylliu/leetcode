package com.leetcode.problem;

/**
 * House Robber
 * @author ln
 *
 */
public class Problem198 {
	public int rob(int[] nums) {
    int a = 0;
    int b = 0;
    for(int i=0;i<nums.length;i++){
    	int tmp = a;
    	a = Math.max(a, b);
    	b = tmp + nums[i];
    }
    
    return Math.max(a, b);
    
}
}

package com.leetcode.problem.one;

/**
 * Maximum Subarray
 * @author ln
 *
 */
public class Problem53 {
	public int maxSubArray(int[] nums) {
		int biggest = nums[0];
		int sum = nums[0];
		for(int i=1; i<nums.length; i++){
			sum = Math.max(nums[i], nums[i]+sum);
			biggest = Math.max(sum, biggest);
		}
		return biggest;
	}
}

package com.leetcode.problem.one;

/**
 * Jump Game
 * @author ln
 *
 */
public class Problem55 {
	public boolean canJump(int[] nums) {
		if(nums.length == 0 || nums.length == 1) return true;
		int max = nums[0];
		for(int i=1; i<nums.length; i++){
			if (max == 0) return false;
			max--;
			if (max < nums[i]) max = nums[i];
			if (max+i >= nums.length-1) return true;
		}
		return false;

	}
}

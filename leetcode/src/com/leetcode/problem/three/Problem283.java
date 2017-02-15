package com.leetcode.problem.three;

/**
 * Move Zeroes
 * @author ln
 *
 */
public class Problem283 {
	public void moveZeroes(int[] nums) {
    int i=0, j=0;
		while(j< nums.length){
			if(nums[i] != 0){
				i++;
				j++;
			}
			else if(nums[i] == 0 && nums[j] == 0)
				j++;
			else if(nums[i] == 0 && nums[j] != 0){
				nums[i] = nums[j];
				nums[j] = 0;
				i++;
				j++;
			}
		}
	}
}

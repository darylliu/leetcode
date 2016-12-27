package com.leetcode.problem.one;

/**
 * Remove Duplicates from Sorted Array
 * @author ln
 *
 */
public class Problem26 {
	public int removeDuplicates(int[] nums) {
    if(nums.length < 2) return nums.length;
    int len = nums.length;
    for(int i=1;i<nums.length;i++){
        if(nums[i-1] == nums[i]) len--;
    }
    return len;
	}
}

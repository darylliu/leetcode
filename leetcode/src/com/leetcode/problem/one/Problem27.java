package com.leetcode.problem.one;

/**
 * Remove Element
 * @author ln
 *
 */
public class Problem27 {
	public int removeElement(int[] nums, int val) {
    int begin = 0;
    for(int i=0 ; i<nums.length; i++) if(nums[i]!=val) nums[begin++] = nums[i];
    return begin;
  }
}

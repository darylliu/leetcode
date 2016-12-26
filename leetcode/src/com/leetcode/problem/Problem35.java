package com.leetcode.problem;

/**
 * Search Insert Position
 * @author ln
 *
 */
public class Problem35 {
	public int searchInsert(int[] nums, int target) {
    int i=0;
    int j=nums.length-1;
    while(i<=j){
    	int medium = (i+j)/2;
    	if(target==nums[medium]) return medium;
    	else if(target<nums[medium]) j = medium-1;
    	else i = medium+1;
    }
    return i;
	}
}

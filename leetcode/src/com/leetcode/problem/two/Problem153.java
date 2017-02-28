package com.leetcode.problem.two;

/**
 * Find Minimum in Rotated Sorted Array
 * @author ln
 *
 */
public class Problem153 {
	public int findMin(int[] nums) {
    if(nums.length == 0) return 0;
    int low = 0;
    int high = nums.length-1;
    while(low<high){
        int mid = low + (high - low)/2;
        if(nums[mid]>nums[high]) low = mid+1;
        if(nums[mid]<nums[high]) high = mid;
    }
    
    return nums[low];
	}
}

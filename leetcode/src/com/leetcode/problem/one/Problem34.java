package com.leetcode.problem.one;

/**
 * Search for a Range
 * @author ln
 *
 */
public class Problem34 {
	public int[] searchRange(int[] nums, int target) {
    if(nums.length == 0) return new int[]{-1,-1};
    int[] res = new int[]{-1,-1}; 
    int start = 0;
    int end = nums.length-1;
    while(start < end){
        int mid = start + (end - start)/2;
        if(nums[mid] < target) start = mid + 1;
        else end = mid;
    }
    if(nums[start]!=target) return res;
    res[0] = start;
    
    end = nums.length - 1;
    while(start < end){
        int mid = start + (end - start)/2 + 1;
        if(nums[mid] > target) end = mid - 1;
        else start = mid;
    }
    res[1] = end;
    return res;
    
    
	}
}

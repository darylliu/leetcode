package com.leetcode.problem.three;

/**
 * Product of Array Except Self
 * @author ln
 *
 */
public class Problem238 {
	public int[] productExceptSelf(int[] nums) {
    int[] output = new int[nums.length];
    for(int i=0 ; i<nums.length; i++){
        if(i==0) output[i] = 1;
        else output[i] = output[i-1] * nums[i-1];
    }
    int right = 1;
    for(int j=nums.length-1; j>=0; j--){
        output[j] = output[j] * right;
        right = nums[j] *right; 
    }
    return output;
	}	
}

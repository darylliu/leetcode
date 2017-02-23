package com.leetcode.problem.five;

/**
 * Max Consecutive Ones
 * @author ln
 *
 */
public class Problem485 {
	public int findMaxConsecutiveOnes(int[] nums) {
    if(nums.length == 0) return 0;
    int res = 0;
    int len = 0;
    for(int i=0; i<nums.length; i++){
        
        if(nums[i] == 1){
            len++;
        }
        else len = 0;
        
        if(len>res) res = len;
        
    }
    return res;
	}
}

package com.leetcode.problem.three;

/**
 * Find the Duplicate Number
 * @author ln
 *
 */
public class Problem287 {
	public int findDuplicate(int[] nums) {
    int slow = 0, fast = 0;
    while(fast<nums.length && nums[fast]<nums.length){
        slow = nums[slow];
        fast = nums[nums[fast]];
        if(slow == fast) break;
    }
    if(slow != fast) return 0;
    
    fast = 0;
    while(slow != fast){
        slow = nums[slow];
        fast = nums[fast];
    }
    return slow;
	}
}

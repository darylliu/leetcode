package com.leetcode.problem.five;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * @author ln
 *
 */
public class Problem448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
    for(int i=0; i< nums.length; i++){
        if(nums[Math.abs(nums[i])-1] > 0) nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
    }
    List<Integer> res = new ArrayList<Integer>();
    for(int i=0; i< nums.length; i++){
        if(nums[i] > 0) res.add(i+1);
    }
    return res;
	}
}

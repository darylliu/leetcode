package com.leetcode.problem.five;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Duplicates in an Array
 * @author ln
 *
 */
public class Problem442 {
	public List<Integer> findDuplicates(int[] nums) {
    List<Integer> res = new ArrayList<Integer>();
    for(int i=0; i<nums.length ; i++){
        if(nums[Math.abs(nums[i])-1] < 0) res.add(Math.abs(nums[i]));
        else nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
    }
    return res;
	}
}

package com.leetcode.problem.one;

import java.util.HashMap;

/**
 * Two Sum
 * @author ln
 *
 */
public class Problem1 {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> results = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++){
			if(!results.containsKey(target - nums[i]))
				results.put(nums[i], i);
			else return new int[]{results.get(target - nums[i]), i};
		}
		return new int[]{0, 0};
	}
}

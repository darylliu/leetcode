package com.leetcode.problem.two;

import java.util.HashMap;

/**
 * Majority Element
 * @author ln
 *
 */
public class Problem169 {
	public int majorityElement(int[] nums) {
    int biggist = nums[0];
		int count = 1;
		HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length;i++){
			if(!cache.containsKey(nums[i])) cache.put(nums[i], 1);
			else {
				cache.put(nums[i], cache.get(nums[i])+1);
				if (cache.get(nums[i])>count) {
					count = cache.get(nums[i]);
					biggist = nums[i];
				}
			}
		}
		return biggist;
	}
}

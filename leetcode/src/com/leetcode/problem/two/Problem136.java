package com.leetcode.problem.two;

import java.util.HashSet;

/**
 * Single Number
 * @author ln
 *
 */
public class Problem136 {
	public int singleNumber(int[] nums) {
    HashSet<Integer> cache = new HashSet<Integer>();
		for(int i=0; i<nums.length;i++){
			if(!cache.contains(nums[i])) cache.add(nums[i]);
			else cache.remove(nums[i]);
		}
		return (int)cache.iterator().next();
	}
}

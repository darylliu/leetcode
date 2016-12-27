package com.leetcode.problem.three;

import java.util.HashSet;

/**
 * Contains Duplicate
 * @author ln
 *
 */
public class Problem217 {
	public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> s = new HashSet<Integer>();
    for(int i=0;i<nums.length; i++){
        if(!s.add(nums[i])) return true;
    }
    System.out.println(s);
    return false;

    
	}
}

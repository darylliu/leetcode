package com.leetcode.problem.four;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Intersection of Two Arrays
 * @author ln
 *
 */
public class Problem349 {
	public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> num = new HashSet<Integer>();
    for(int i=0;i<nums1.length; i++){
        if(!num.contains(nums1[i])) num.add(nums1[i]);
    }
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    for(int i=0;i<nums2.length; i++){
        if(num.contains(nums2[i])) {
            tmp.add(nums2[i]);
            num.remove(nums2[i]);
        }
    }
    int[] result = new int[tmp.size()];
    for(int i=0; i<tmp.size(); i++){
        result[i] = tmp.get(i);
    }
    return result;
	}
}

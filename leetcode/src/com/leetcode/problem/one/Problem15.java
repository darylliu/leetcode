package com.leetcode.problem.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 3Sum
 * @author ln
 *
 */
public class Problem15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length<3 ) return res;
		
    Arrays.sort(nums);
        
    for(int i =0;i<nums.length-2; i++){
    	if(i==0 || (i>0 && nums[i-1]!=nums[i])){
    		int lo = i+1 ;
        int hi = nums.length-1;
        int sum = -(nums[i]);
        while(lo < hi){
        	if(nums[lo]+nums[hi] == sum){
        		res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
        		while (lo < hi && nums[lo] == nums[lo+1]) lo++;
        		while (lo < hi && nums[hi] == nums[hi-1]) hi--;
        		lo++;
        		hi--;
        	}
        	else if(nums[lo] + nums[hi] < sum) lo++;
        	else hi--;
        }
    	}
      
    }
    return res;
    
  }
	
	
}

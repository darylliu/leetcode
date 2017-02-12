package com.leetcode.problem.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4Sum
 * @author ln
 *
 */
public class Problem18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length<4 ) return res;
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-3; i++){
			if(i==0 || (i>0 && nums[i-1]!=nums[i])){
				threeSum(nums, target-nums[i], res, i);
			}
		}
		
		return res;
  }
	
	public void threeSum(int[] nums, int target, List<List<Integer>> res, int start) {
    for(int i = start+1;i<nums.length-2; i++){
    	if(i==start+1 ||(i>start+1 && nums[i-1]!=nums[i])){
    		int lo = i+1 ;
        int hi = nums.length-1;
        int sum = target - nums[i];
        while(lo < hi){
        	if(nums[lo]+nums[hi] == sum){
        		res.add(Arrays.asList(nums[start], nums[i], nums[lo], nums[hi]));
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
    
    
  }
}

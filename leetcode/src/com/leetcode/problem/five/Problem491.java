package com.leetcode.problem.five;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Increasing Subsequences
 * @author ln
 *
 */
public class Problem491 {
	Set<List<Integer>> res= new HashSet<List<Integer>>();
  public List<List<Integer>> findSubsequences(int[] nums) {
      dfs(new ArrayList<Integer>(), nums, 0);
      return new ArrayList(res);
  }
  
  public void dfs(List<Integer> list, int[] nums, int start){
      if (list.size() >= 2) {
          res.add(new ArrayList(list));
      }
      for(int i=start; i<nums.length; i++){
          if(list.size() == 0 || nums[i] >= list.get(list.size()-1)) {
              list.add(nums[i]);
              dfs(list, nums, i+1);
              list.remove(list.size()-1);
          }
      }
  }
}

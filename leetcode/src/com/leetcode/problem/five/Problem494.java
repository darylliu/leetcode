package com.leetcode.problem.five;

/**
 * Target Sum
 * @author ln
 *
 */
public class Problem494 {
	int count = 0;
  public int findTargetSumWays(int[] nums, int S) {
      if (nums == null || nums.length == 0) return 0;
      dfs(nums, S, 0, 0);
      return count;
  }
  
  public void dfs(int[] nums, int S, int i, int result){
      if(i==nums.length) {
          if(S==result)count++;
          return ;
      }
      
      else{
          dfs(nums, S, i+1, result + nums[i]);
          dfs(nums, S, i+1, result - nums[i]);
      }
      
      return;
  }
}

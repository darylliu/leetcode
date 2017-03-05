package com.leetcode.problem.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Combination Sum
 * @author ln
 *
 */
public class Problem39 {
	List<List<Integer>> res = new ArrayList<>();
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
      backtrack(candidates, target, 0, new ArrayList<Integer>());
      return res;
  }
  public void backtrack(int[] candidates, int target, int start, List<Integer> list){
      if(target < 0) return;
      if(target == 0) res.add(new ArrayList<>(list));
      else{
          for(int i = start; i<candidates.length; i++){
              list.add(candidates[i]);
              backtrack(candidates, target-candidates[i], i, list);
              list.remove(list.size()-1);
          }
      }
      
  }
}

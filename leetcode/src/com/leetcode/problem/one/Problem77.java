package com.leetcode.problem.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Combinations
 * @author ln
 *
 */
public class Problem77 {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
  public List<List<Integer>> combine(int n, int k) {
      List<Integer> item = new ArrayList<Integer>();
      bfs(1, n, k, item);
      return res;
  }
  
  public void bfs(int start, int end, int k, List<Integer> item){
      if(item.size() == k) {
          res.add(new ArrayList<Integer>(item));
          return;
      }
      else{
          for(int i=start ;i <=end; i++){
              item.add(i);
              bfs(i+1, end, k, item);
              item.remove(item.size()-1);
          }
      }
  }
}

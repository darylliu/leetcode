package com.leetcode.problem.six;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Find Largest Value in Each Tree Row
 * @author ln
 *
 */
public class Problem515 {
	List<Integer> res = new ArrayList<Integer>();
  public List<Integer> largestValues(TreeNode root) {
      dfs(root, 1);
      return res;
  }
  
  public void dfs(TreeNode root, int level){
      if(root == null) return;
      if(level > res.size()) res.add(Integer.MIN_VALUE);
      if(root.val > res.get(level-1)) res.set(level-1, root.val);
      dfs(root.left, level+1);
      dfs(root.right, level+1);
  }
}

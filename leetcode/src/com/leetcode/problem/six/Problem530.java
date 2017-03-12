package com.leetcode.problem.six;

import com.leetcode.util.TreeNode;

/**
 * Minimum Absolute Difference in BST
 * @author ln
 *
 */
public class Problem530 {
	int min = Integer.MAX_VALUE;
  Integer pre = null;
  public int getMinimumDifference(TreeNode root) {
      if(root == null) return min;
      getMinimumDifference(root.left);
      
      if(pre!=null){
          min = Math.min(min, root.val-pre);
      }
      
      pre = root.val;
      
      getMinimumDifference(root.right);
      
      return min;
  }
}

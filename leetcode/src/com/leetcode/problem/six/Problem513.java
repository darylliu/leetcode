package com.leetcode.problem.six;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Find Bottom Left Tree Value
 * @author ln
 *
 */
public class Problem513 {
	List<Integer> result = new ArrayList<Integer>();
  public int findBottomLeftValue(TreeNode root) {
      if(root == null) return 0;
      find(root, 1);
      return result.get(result.size()-1);
  }
  
  public void find(TreeNode root, int level){
      if(root == null) return;
      if(level > result.size()){
          result.add(root.val);
      }
      find(root.left, level+1);
      find(root.right, level+1);
  }
}

package com.leetcode.problem.three;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Paths
 * @author ln
 *
 */
public class Problem257 {
	List<String> results = new ArrayList<String>();
  public List<String> binaryTreePaths(TreeNode root) {
      if(root == null) return results;
      if (root.left == null && root.right == null) results.add(""+root.val);
      traveral(root.left, root.val+"");
      traveral(root.right, root.val+"");
      return results;
  }
  
  public void traveral(TreeNode root, String str){
      if (root == null ) return;
      if (root.left == null && root.right == null) results.add(str+"->"+root.val);
      else {
          traveral(root.left, str+"->"+root.val);
          traveral(root.right, str+"->"+root.val);
      }
  }
}

package com.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Preorder Traversal
 * @author ln
 *
 */
public class Problem144 {
	List<Integer> result = new ArrayList<Integer>();
  
  public void traversalPreOrder(TreeNode root) {
      if(root == null) return ;
      result.add(root.val);
      traversalPreOrder(root.left);
      traversalPreOrder(root.right);
  }
  public List<Integer> preorderTraversal(TreeNode root) {
      traversalPreOrder(root);
      return result;
  }
}

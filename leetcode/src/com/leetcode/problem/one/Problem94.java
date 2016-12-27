package com.leetcode.problem.one;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Inorder Traversal
 * @author ln
 *
 */
public class Problem94 {
	List<Integer> result = new ArrayList<Integer>();
  public List<Integer> inorderTraversal(TreeNode root) {
      traversalInOrder(root);
      return result;
  }
  
  public void traversalInOrder(TreeNode root) {
      if(root == null) return ;
      traversalInOrder(root.left);
      result.add(root.val);
      traversalInOrder(root.right);
  }
}

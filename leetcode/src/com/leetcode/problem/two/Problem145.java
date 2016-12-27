package com.leetcode.problem.two;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Postorder Traversal
 * @author ln
 *
 */
public class Problem145 {
	List<Integer> result = new ArrayList<Integer>();
  public List<Integer> postorderTraversal(TreeNode root) {
      traversalPostOrder(root);
      return result;
  }
  
  public void traversalPostOrder(TreeNode root) {
      if(root == null) return ;
      traversalPostOrder(root.left);
      traversalPostOrder(root.right);
      result.add(root.val);
  }
}

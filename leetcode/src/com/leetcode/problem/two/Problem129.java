package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Sum Root to Leaf Numbers
 * @author ln
 *
 */
public class Problem129 {
	public int sumNumbers(TreeNode root) {
    return sum(root, 0);
  }
	
	public int sum(TreeNode root, int s){
		if(root == null) return 0;
		if(root.right == null && root.left == null) return s*10 + root.val;
		else return sum(root.left, s*10 + root.val) + sum(root.right, s*10 + root.val);
	}
}

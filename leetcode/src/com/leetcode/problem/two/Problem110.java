package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Balanced Binary Tree
 * @author ln
 *
 */
public class Problem110 {
	public boolean isBalanced(TreeNode root) {
    return this.height(root)!=-1;
    
	}
	public int height(TreeNode root){
    if (root==null) return 0;
    int left = this.height(root.left);
    int right = this.height(root.right);
    if (Math.abs(left-right)>1 || left == -1 || right == -1) return -1;
    else return Math.max(left, right)+1;
    
	}
}

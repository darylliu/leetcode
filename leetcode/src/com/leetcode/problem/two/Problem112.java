package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Path Sum
 * @author ln
 *
 */
public class Problem112 {
	public boolean hasPathSum(TreeNode root, int sum) {
    if(root == null) return false;
    if(root.left == null && root.right == null && sum == root.val) return true;
    return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    
	}
}

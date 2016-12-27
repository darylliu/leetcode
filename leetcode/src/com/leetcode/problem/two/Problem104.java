package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Maximum Depth of Binary Tree
 * @author ln
 *
 */
public class Problem104 {
	public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}
}

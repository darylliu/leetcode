package com.leetcode.problem.three;

import com.leetcode.util.TreeNode;

/**
 * Count Complete Tree Nodess
 * @author ln
 *
 */
public class Problem222 {
	public int countNodes(TreeNode root) {
    int leftDepth = leftDepth(root);
		int rightDepth = rightDepth(root);
	
		if (leftDepth == rightDepth)
			return (1 << leftDepth) - 1;
		else
			return 1+countNodes(root.left) + countNodes(root.right);
	}
	public int rightDepth(TreeNode root) {
	    int dep = 0;
	    while(root!=null){
	        root = root.right;
	    dep++;
	    }
	    return dep;
	}
	public int leftDepth(TreeNode root) {
	    int dep = 0;
		while (root != null) {
			root = root.left;
			dep++;
		}
		return dep;
	}
}

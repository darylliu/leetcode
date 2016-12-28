package com.leetcode.problem.three;

import com.leetcode.util.TreeNode;

/**
 * Invert Binary Tree
 * @author ln
 *
 */
public class Problem226 {
	public TreeNode invertTree(TreeNode root) {
    traverTree(root);
    return root;
	}
	
	public void traverTree(TreeNode root){
	    if (root == null) return;
	    if (root.left == null && root.right == null) return;
	    else if (root.left == null && root.right != null) {
	        root.left = root.right;
	        root.right = null;
	        traverTree(root.left);
	    }
	    else if (root.left != null && root.right == null) {
	        root.right = root.left;
	        root.left = null;
	        traverTree(root.right);
	    }
	    else{
	        TreeNode tmp = root.left;
	        root.left = root.right;
	        root.right = tmp;
	        traverTree(root.left);
	        traverTree(root.right);
	    }
	}
}

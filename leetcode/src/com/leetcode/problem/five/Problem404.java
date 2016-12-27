package com.leetcode.problem.five;

import com.leetcode.util.TreeNode;

/**
 * Sum of Left Leaves
 * @author ln
 *
 */
public class Problem404 {
	public int sumOfLeftLeaves(TreeNode root) {
    return valueOfLeft(root);
	}
	
	public int valueOfLeft(TreeNode root){
    if (root == null) return 0;
    else if(root.left == null && root.right==null) return 0;
    if(root.left == null && root.right != null) return valueOfLeft(root.right);
    else if(root.left!=null && root.right == null){
        if(root.left.left !=null || root.left.right !=null) return valueOfLeft(root.left);
        else return root.left.val;
    } 
    else {
        if(root.left.left !=null || root.left.right !=null) return valueOfLeft(root.left)+valueOfLeft(root.right);
        else return root.left.val+valueOfLeft(root.right);
    }
   
}
}

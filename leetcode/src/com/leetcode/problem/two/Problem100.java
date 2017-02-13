package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Same Tree
 * @author ln
 *
 */
public class Problem100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if ((p==null&&q!=null)||(p!=null&&q==null)) return false;
    if (p==null && q==null) return true;
    else if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
    else return false;
	}
}

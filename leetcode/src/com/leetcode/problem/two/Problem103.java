package com.leetcode.problem.two;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Zigzag Level Order Traversal
 * @author ln
 *
 */
public class Problem103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    traverse(root, res, 0);
    return res;
	}
	
	public void traverse(TreeNode root, List<List<Integer>> res, int level){
	    if(root == null) return;
	    if(res.size() <= level){
	        List<Integer> newList = new ArrayList<Integer>();
	        res.add(newList);
	    }
	    List<Integer> col = res.get(level);
	    if(level % 2 == 0){
	        col.add(root.val);
	    }
	    else{
	        col.add(0, root.val);
	    }
	    traverse(root.left, res, level+1);
	    traverse(root.right, res, level+1);
	}
}

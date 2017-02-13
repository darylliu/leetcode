package com.leetcode.problem.two;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Level Order Traversal
 * @author ln
 *
 */
public class Problem102 {
	List<List<Integer>> re = new ArrayList<List<Integer>>();
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null) return re;
		bfs(root, 0);
		return re;
	}
	
	public void bfs(TreeNode root, int level){
		if(root == null) return;
		if(re.size()-1<level){
			re.add(new ArrayList<Integer>());
		}
		re.get(level).add(root.val);
		bfs(root.left, level+1);
		bfs(root.right, level+1);
	}
}

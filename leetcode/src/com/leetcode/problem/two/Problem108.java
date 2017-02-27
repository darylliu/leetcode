package com.leetcode.problem.two;

import com.leetcode.util.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree
 * @author ln
 *
 */
public class Problem108 {
	public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length == 0) return null;
    return dfs(nums, 0, nums.length-1);
}

	public TreeNode dfs(int[] nums, int i, int j){
	    if(i > j) return null;
	    if(i == j) return new TreeNode(nums[i]);
	    int mid = i+ (j-i)/2;
	    TreeNode cur = new TreeNode(nums[mid]);
	    cur.left = dfs(nums, i, mid-1);
	    cur.right = dfs(nums, mid+1, j);
	    return cur;
	}
}

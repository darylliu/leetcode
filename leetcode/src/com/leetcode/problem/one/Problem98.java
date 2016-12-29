package com.leetcode.problem.one;

import java.util.ArrayList;

import com.leetcode.util.TreeNode;

/**
 * Validate Binary Search Tree
 * @author ln
 *
 */
public class Problem98 {
	ArrayList<Integer> tmp = new ArrayList<Integer>();
  public boolean isValidBST(TreeNode root) {
      if(root==null) return true;
      if(root.left == null && root.right == null) return true;
      inOrder(root);
      for(int i=1; i<tmp.size(); i++){
          if(tmp.get(i-1)>= tmp.get(i)) return false;
      }
      return true;
  }
  
  public void inOrder(TreeNode root){
      if(root == null) return;
      inOrder(root.left);
      tmp.add(root.val);
      inOrder(root.right);
      
  }
}

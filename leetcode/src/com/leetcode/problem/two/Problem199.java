package com.leetcode.problem.two;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.util.TreeNode;

/**
 * Binary Tree Right Side View
 * @author ln
 *
 */
public class Problem199 {
	List<Integer> re = new ArrayList<Integer>();
  public List<Integer> rightSideView(TreeNode root) {
      if(root == null) return re;
      bfs(root, 0);
      return re;
  }
  
  public void bfs(TreeNode root, int level){
      if (root == null) return;
      else{
          if(re.size()-1<level) re.add(root.val);
          else re.set(level, root.val);
      }
      bfs(root.left, level+1);
      bfs(root.right, level+1);
  }
}

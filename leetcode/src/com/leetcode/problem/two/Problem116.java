package com.leetcode.problem.two;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.util.TreeLinkNode;

/**
 * Populating Next Right Pointers in Each Node
 * @author ln
 *
 */
public class Problem116 {
	public void connect(TreeLinkNode root) {
    if(root == null) return;
    Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
    queue.add(root);
    int levelSize = 1;
    while(!queue.isEmpty()){
        TreeLinkNode tl = queue.poll();
        levelSize--;
        if(tl.left!=null)queue.add(tl.left);
        if(tl.right!=null)queue.add(tl.right);
        if(levelSize > 0)tl.next = queue.peek();
        else levelSize = queue.size();
        
    }
	}
}

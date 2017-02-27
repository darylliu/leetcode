package com.leetcode.problem.two;

import com.leetcode.util.ListNode;
import com.leetcode.util.TreeNode;

/**
 * Convert Sorted List to Binary Search Tree
 * @author ln
 *
 */
public class Problem109 {
	public TreeNode sortedListToBST(ListNode head) {
    if(head==null) return null;
    return toBST(head,null);
	}
	
	public TreeNode toBST(ListNode head, ListNode tail){
	    ListNode slow = head;
	    ListNode fast = head;
	    if(head==tail) return null;
	    
	    while(fast!=tail&&fast.next!=tail){
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    TreeNode thead = new TreeNode(slow.val);
	    thead.left = toBST(head,slow);
	    thead.right = toBST(slow.next,tail);
	    return thead;
	}
}

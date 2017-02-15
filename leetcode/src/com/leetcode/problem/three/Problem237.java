package com.leetcode.problem.three;

import com.leetcode.util.ListNode;

/**
 * Delete Node in a Linked List
 * @author ln
 *
 */
public class Problem237 {
	public void deleteNode(ListNode node) {
    ListNode p=node, q=node.next;
    if(q == null) return ;
    while(q.next!=null){
        p.val = q.val;
        p = q; 
        q = q.next;
    }
    p.val = q.val;
    p.next = null;
	}
}

package com.leetcode.problem.one;

import com.leetcode.util.ListNode;

/**
 * Remove Duplicates from Sorted List II
 * @author ln
 *
 */
public class Problem82 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode p = pre;
		while(p.next != null){
			ListNode q = p.next;
			while(q.next != null && q.val == q.next.val){
				q = q.next;
			}
			
			if(q != p.next){
				p.next = q.next;
			}
			else{
				p = p.next;
			}
			
		}
    return pre.next;
  }
}

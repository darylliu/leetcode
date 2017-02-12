package com.leetcode.problem.one;

import com.leetcode.util.ListNode;

/**
 * Remove Duplicates from Sorted List
 * @author ln
 *
 */
public class Problem83 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode p = head;
		while(p.next != null){
			if(p.val == p.next.val){
				p.next = p.next.next;
			}
			else{
		    p = p.next;
			}
		}
    return head;
  }
}

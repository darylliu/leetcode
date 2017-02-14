package com.leetcode.problem.two;

import com.leetcode.util.ListNode;

/**
 * Linked List Cycle
 * @author ln
 *
 */
public class Problem141 {
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) return false;
		ListNode slow = head, fast = head.next.next;
		while(fast !=null && fast.next != null){
			if(fast == slow) return true;
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
		
	}
}

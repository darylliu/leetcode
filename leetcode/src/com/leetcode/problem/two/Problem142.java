package com.leetcode.problem.two;

import com.leetcode.util.ListNode;

/**
 * Linked List Cycle II
 * @author ln
 *
 */
public class Problem142 {
	public ListNode detectCycle(ListNode head) {
    if(head == null|| head.next == null) return null;
    ListNode slow = head;
    ListNode fast = head;
    System.out.println("test1");
    while(fast!=null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) break;
    }
    System.out.println("test2");
    
    if(slow!=fast) return null;
    fast = head;
    while(fast!=slow){
        slow = slow.next;
        fast = fast.next;
    }
    
    return slow;
	}
}

package com.leetcode.problem.three;

import com.leetcode.util.ListNode;

/**
 * Reverse Linked List
 * @author ln
 *
 */
public class Problem206 {
	public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode pre = head, cur = head.next;
    head.next = null;
    while(cur!= null){
        pre = cur;
        cur = cur.next;
        pre.next = head;
        head = pre;
    }
    return head;
    
  
	}
}

package com.leetcode.problem.four;

import com.leetcode.util.ListNode;

/**
 * Odd Even Linked List
 * @author ln
 *
 */
public class Problem328 {
	public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode p = head;
    ListNode head2 = new ListNode(0);
    ListNode q = head2;
    
    ListNode move = head.next;
    boolean isOdd = false;
    while(move!=null){
        if(isOdd) {
            p.next = move;
            p = p.next;
            isOdd = false;
        }
        else{
            q.next = move;
            q = q.next;
            isOdd = true;
        }
        move = move.next;
    }
    p.next = head2.next;
    q.next = null;
    
    return head;
	}
}

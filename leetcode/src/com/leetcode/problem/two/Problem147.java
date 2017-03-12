package com.leetcode.problem.two;

import com.leetcode.util.ListNode;

/**
 * Insertion Sort List
 * @author ln
 *
 */
public class Problem147 {
	public ListNode insertionSortList(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode res = new ListNode(0); //new starter of the sorted list
    res.next = head;
		ListNode p = head, q, r; 
		
		while( p != null && p.next!=null ){
			if(p.val<=p.next.val){
			    p = p.next;
			}
			else{
			    q = p.next;
			    p.next = q.next;
			    r = res;
			    while(r.next!=null && r.next.val<=q.val){
			        r = r.next;
			    }
			    q.next = r.next;
			    r.next = q ;
			}
		}
		
		return res.next;
		}
}

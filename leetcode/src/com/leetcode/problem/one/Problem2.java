package com.leetcode.problem.one;

import com.leetcode.util.ListNode;

/**
 * Add Two Numbers
 * @author ln
 *
 */
public class Problem2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = 0;
		ListNode result = new ListNode(0);
		ListNode p = result;
    while(l1!=null && l2!=null){
    	sum = l1.val + l2.val + sum;
    	p.next = new ListNode(sum%10);
    	p = p.next;
    	l1 = l1.next;
    	l2 = l2.next;
    	sum = sum/10;
    }
    
    while(l1 != null){
    	sum = l1.val + sum;
    	p.next = new ListNode(sum%10);
    	p = p.next;
    	l1 = l1.next;
    	sum = sum/10;
    	
    }
    
    while(l2 != null){
    	sum = l2.val + sum;
    	p.next = new ListNode(sum%10);
    	p = p.next;
    	l2 = l2.next;
    	sum = sum/10;
    
    }
    if (sum != 0) p.next = new ListNode(sum);
    
    return result.next;
    
  }
}

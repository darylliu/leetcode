package com.leetcode.problem.two;

import com.leetcode.util.ListNode;

/**
 * Intersection of Two Linked Lists
 * @author ln
 *
 */
public class Problem160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lengthA = getLength(headA);
    int lengthB = getLength(headB);
    ListNode a = headA;
    ListNode b = headB;
    if(lengthA < lengthB){
        for(int i=0; i<(lengthB - lengthA); i++){
            b = b.next;
        }
    }
    else{
        for(int i=0; i<(lengthA - lengthB); i++){
            a = a.next;
        }
    }
    while(a!=b){
        a = a.next;
        b = b.next;
    }
    return a;
    
	}
	
	public int getLength(ListNode head){
	    int i = 0;
	    while(head!=null){
	        i++;
	        head = head.next;
	    }
	    return i;
	}
}

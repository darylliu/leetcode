package com.leetcode.problem.four;

import java.util.Random;

import com.leetcode.util.ListNode;

/**
 * Linked List Random Node
 * @author ln
 *
 */
public class Problem382 {
	ListNode head = null;
  /** @param head The linked list's head.
      Note that the head is guaranteed to be not null, so it contains at least one node. */
  public Problem382(ListNode head) {
      this.head = head;
  }
  
  /** Returns a random node's value. */
  public int getRandom() {
      int res = 0;
      ListNode p = head;
      int i=0;
      while(p!=null){
          if(new Random().nextInt(++i) == (i-1)) res = p.val;
          p = p.next;
      }
      return res;
  }
}

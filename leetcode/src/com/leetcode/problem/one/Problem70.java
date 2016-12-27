package com.leetcode.problem.one;

import java.util.ArrayList;

/**
 * Climbing Stairs
 * @author ln
 *
 */
public class Problem70 {
	public int climbStairs(int n) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    int i=1;
    while(i<=n){
      if(i==1) list.add(1);
      else if(i==2) list.add(2);
      else{
      	list.add(list.get(i-2)+list.get(i-3));
      }
      i++;
    }
    return list.get(list.size()-1);
  }
}

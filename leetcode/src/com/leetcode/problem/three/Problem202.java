package com.leetcode.problem.three;

import java.util.HashSet;

/**
 * Happy Number
 * @author ln
 *
 */
public class Problem202 {
	public boolean isHappy(int n) {
		if(n < 1) return false;
		if(n == 1) return true;
    HashSet<Integer> numbers = new HashSet<Integer>();
    while(true){
    	int s = 0;
    	while(n > 0){
    		s += (n%10) * (n%10);
    		n = n/10;
    	}
    	if(s==1) return true;
    	else if(numbers.contains(s)) return false;
    	numbers.add(s);
    	n = s;
    	
    }
  }
}

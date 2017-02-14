package com.leetcode.problem.two;

/**
 * Factorial Trailing Zeroes
 * @author ln
 *
 */
public class Problem172 {
	public int trailingZeroes(int n) {
		if(n<1) return 0;
		int sum=0;
		while(n/5 > 0){
			n = n/5;
			sum += n;
		}
		return sum;
	}
}

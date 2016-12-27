package com.leetcode.problem.three;

/**
 * Add Digits
 * @author ln
 *
 */
public class Problem258 {
	public int addDigits(int num) {
    return (num - 1) % 9 + 1;
	}
}

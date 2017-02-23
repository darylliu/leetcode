package com.leetcode.problem.two;

/**
 * Number of 1 Bits
 * @author ln
 *
 */
public class Problem191 {
	public int hammingWeight(int n) {
    int count = 0;
    for(int i=0; i<32; i++){
        count += (n >> i & 1) == 1 ? 1: 0;
    }
    return count;
	}
}

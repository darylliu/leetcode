package com.leetcode.problem.five;

/**
 * Hamming Distance
 * @author ln
 *
 */
public class Problem461 {
	public int hammingDistance(int x, int y) {
    return Integer.bitCount(x ^ y);
	}
}

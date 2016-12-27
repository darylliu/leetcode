package com.leetcode.problem.five;

/**
 * Arranging Coins
 * @author ln
 *
 */
public class Problem441 {
	public int arrangeCoins(int n) {
    if(n<1) return 0;
    int count=0, i;
    for( i=1; i<=n-count;i++){
        count +=i;
    }
    return i-1;
	}
}

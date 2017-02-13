package com.leetcode.problem.two;

/**
 * Best Time to Buy and Sell Stock
 * @author ln
 *
 */
public class Problem121 {
	public int maxProfit(int[] prices) {
    int max = 0;
    int tmp = 0;
    for(int i=1;i<prices.length; i++){
        tmp = Math.max(0, tmp += prices[i] - prices[i-1]) ;
        max = Math.max(max, tmp);
        
    }
    return max;
}
}

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
        int tmp2 = prices[i] - prices[i-1];
        if(tmp2+tmp>max) max = tmp2+tmp;
        if(tmp2+tmp<0) tmp = 0;
        else tmp += tmp2;
        
    }
    return max;
}
}

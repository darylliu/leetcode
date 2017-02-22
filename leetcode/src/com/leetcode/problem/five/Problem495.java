package com.leetcode.problem.five;

/**
 * Teemo Attacking
 * @author ln
 *
 */
public class Problem495 {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
    if(timeSeries.length == 0) return 0;
    if(timeSeries.length == 1) return duration;
    int res = 0;
    for(int i=1 ; i<timeSeries.length; i++){
        if((timeSeries[i] - timeSeries[i-1]) >= duration) res += duration;
        else
            res += timeSeries[i] - timeSeries[i-1];
        
    }
    return res + duration;
	}
}

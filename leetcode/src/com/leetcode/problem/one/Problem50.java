package com.leetcode.problem.one;

/**
 * Pow(x, n)
 * @author ln
 *
 */
public class Problem50 {
	public double myPow(double x, int n) {
    if (n==0) return 1;
    boolean isPos = true;
    if (n<0) isPos = false;
    double result = 1;
    for(int i=0; i<Math.abs(n); i++){
        result *= x;
    }
    if(isPos)
        return result;
    else return 1/result;
	}
}

package com.leetcode.problem.four;

/**
 * Valid Perfect Square
 * @author ln
 *
 */
public class Problem367 {

	public boolean isPerfectSquare(int num) {
    if (num == 1) return true;
    int low = 1, high = num/2;
    while(low <= high){
        long mid = (low + high)/2;
        if(mid * mid == num) return true;
        else if(mid * mid < num) low =(int)mid + 1;
        else high = (int)mid - 1; 
    }
    return false;
    
	}
}

package com.leetcode.problem.one;

/**
 * Palindrome Number
 * @author ln
 *
 */
public class Problem9 {
	public boolean isPalindrome(int x) {
    if(x<0) return false;
    int re = 0;
    int pre = x;
    while(pre/10 >0 ){
        re = re *10 + pre%10;
        pre=pre/10;
    }
    if(re == 0)re += pre;
    else re = re*10 + pre; 
    
    return x==re;
	}
}

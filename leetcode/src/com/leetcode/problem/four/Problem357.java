package com.leetcode.problem.four;

/**
 * Count Numbers with Unique Digits
 * @author ln
 *
 */
public class Problem357 {
	public int countNumbersWithUniqueDigits(int n) {
    if(n==0) return 1;
    int res = 10;
    int uniqueDigits = 9;
    int availableNumber = 9;
    while(availableNumber>0 && n-->1){
        uniqueDigits = uniqueDigits * availableNumber;
        res += uniqueDigits;
        availableNumber--;
        
    }
    return res;
	}
}

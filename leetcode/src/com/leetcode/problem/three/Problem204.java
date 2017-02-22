package com.leetcode.problem.three;

/**
 * Count Primes
 * @author ln
 *
 */
public class Problem204 {
	public int countPrimes(int n) {
    boolean[] res = new boolean[n];
    int count = 0;
    for(int i=2; i<n ; i++){
        if(res[i] == false){
            count++;
            for(int j = 2; i*j <n; j++){
                res[j*i] = true;
            }
        }
    }
    return count;
	}
}

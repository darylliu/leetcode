package com.leetcode.problem.one;

/**
 * Sqrt(x)
 * @author ln
 *
 */
public class Promblem69 {
	public int mySqrt(int x) {
    if (0 == x) return 0;
    int ans = x;
    int left = 1, right = x;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (mid <= x / mid) {
            left = mid + 1;
            ans = mid;
        } else {
            right = mid - 1;
        }
    }
    return ans;
	}
}

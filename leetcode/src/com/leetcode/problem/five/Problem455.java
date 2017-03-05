package com.leetcode.problem.five;

import java.util.Arrays;

/**
 * Assign Cookies
 * @author ln
 *
 */
public class Problem455 {
	public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    
    int pointG = 0;
    int pointS = 0;
    
    while (pointG<g.length && pointS<s.length) {
        if (g[pointG]<=s[pointS]) {
            pointG++;
            pointS++;
        } else {
            pointS++;
        }
    }
    
    return pointG;
   
	}
}

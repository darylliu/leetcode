package com.leetcode.problem.five;

/**
 * Number of Segments in a String
 * @author ln
 *
 */
public class Problem434 {
	public int countSegments(String s) {
    int counter = 0;
    for (int i=0; i<s.length(); i++) {
        if (s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) {
            counter++;
        }
    }
    	
    return counter;
	}
}

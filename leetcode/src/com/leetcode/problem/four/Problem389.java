package com.leetcode.problem.four;

import java.util.Arrays;

/**
 * Find the Difference
 * @author ln
 *
 */
public class Problem389 {
	public char findTheDifference(String s, String t) {
    char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(t1);
    for(int i=0;i<s.length(); i++){
    	if(s1[i]!=t1[i]) return t1[i];
    }
    return t1[t1.length-1];
  }
}

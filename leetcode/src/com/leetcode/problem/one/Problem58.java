package com.leetcode.problem.one;

/**
 * Length of Last Word
 * @author ln
 *
 */
public class Problem58 {
	public int lengthOfLastWord(String s) {
    if (s.split(" ").length==0) return 0;
    return s.split(" ")[s.split(" ").length-1].length();
	}
}

package com.leetcode.problem.two;

import java.util.Arrays;
import java.util.Collections;

/**
 * Reverse Words in a String
 * @author ln
 *
 */
public class Problem151 {
	public String reverseWords(String s) {
		String[] parts = s.trim().split("\\s+");
		String out = "";
		for (int i = parts.length - 1; i > 0; i--) {
		    out += parts[i] + " ";
		}
		return out + parts[0];
  }
}

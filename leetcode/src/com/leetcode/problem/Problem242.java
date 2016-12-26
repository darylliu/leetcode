package com.leetcode.problem;

import java.util.Arrays;

/**
 * Valid Anagram
 * @author ln
 *
 */
public class Problem242 {
	public boolean isAnagram(String s, String t) {
    if(s==null||t==null||s.length()!=t.length()){  
      return false;  
		} 
    char[] array1 = s.toCharArray();
    char[] array2 = t.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);
    return Arrays.equals(array1, array2);
  }
}

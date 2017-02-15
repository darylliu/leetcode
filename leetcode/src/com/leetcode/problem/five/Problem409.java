package com.leetcode.problem.five;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Palindrome
 * @author ln
 *
 */
public class Problem409 {
	public int longestPalindrome(String s) {
		Set<Character> con = new HashSet<Character>();
    for(int i=0 ;i<s.length(); i++){
        if(con.contains(s.charAt(i))) con.remove(s.charAt(i));
        else con.add(s.charAt(i));
    }
    if(con.size() == 0) return s.length();
    return s.length() - con.size() + 1;
    
	}
}

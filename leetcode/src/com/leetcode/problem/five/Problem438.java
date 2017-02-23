package com.leetcode.problem.five;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Anagrams in a String
 * @author ln
 *
 */
public class Problem438 {
	public List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<Integer>();
    if (s == null || s.length() == 0 || p == null || p.length() == 0) return res;
    int[] hash = new int[255];
    for(char c: p.toCharArray()){
        hash[c]++;
    }
    int left =0 ,right=0, count = p.length();
    while(right < s.length()){
        if(hash[s.charAt(right++)]-- >=1 ) count--;
        if(count == 0) res.add(left);
        if(right-left == p.length() && hash[s.charAt(left++)]++ >=0) count++;
    }
    
    return res;
	}
}

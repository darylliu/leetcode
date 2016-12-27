package com.leetcode.problem.four;

/**
 * First Unique Character in a String
 * @author ln
 *
 */
public class Problem387 {
	
		public int firstUniqChar(String s) {
	    int[] tmp = new int[26];
	    for(int i=0; i<s.length(); i++){
	        tmp[s.charAt(i)-97]++;
	    }
	   
	    for(int i=0;i<s.length();i++){
	    	
	        if(tmp[s.charAt(i)-97]==1) return i;
	    }
	    return -1;
	}

}

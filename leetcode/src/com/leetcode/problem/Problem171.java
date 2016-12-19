package com.leetcode.problem;

import java.util.HashMap;

/**
 * Excel Sheet Column Number
 * @author ln
 *
 */
public class Problem171 {

	public int titleToNumber(String s) {
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for(int i=0; i<26; i++){
    	map.put((char) ('A'+i), i+1);
    }
    int result = 0;
    for(int i=s.length()-1; i>=0; i--){
    	int tmp = map.get(s.charAt(i));
    	result = (int) (result + tmp* Math.pow(26, s.length()-1-i));
    }
    return result;
  }
}

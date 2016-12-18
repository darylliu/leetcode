package com.leetcode.problem;

import java.util.HashMap;

/**
 * Excel Sheet Column Title
 * @author ln
 *
 */
public class Problem168 {
	public String convertToTitle(int n) {
		HashMap<Integer,Character> map = new HashMap<Integer,Character>();
    for(int i=0; i<26; i++){
    	map.put(i+1,(char) ('A'+i));
    }
    String result = "";
    while(n>0){
    	int tmp = n%26;
    	if(tmp==0){
    		result = "Z" + result;
    		n--;
    	}
    	else result = map.get(tmp) + result;
    	n = n/26;
    }
    
    return result;
  }
}

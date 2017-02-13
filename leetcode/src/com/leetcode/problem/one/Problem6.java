package com.leetcode.problem.one;

import java.util.Arrays;

/**
 * ZigZag Conversion
 * @author ln
 *
 */
public class Problem6 {
	public String convert(String s, int numRows) {
		if(numRows==1) return s;
		String[] re = new String[numRows];
		for(int i=0; i<numRows; i++){
			re[i] = "";
		}
		
		int gap = numRows-2;
		int i=0;
		while(i<s.length()){
			for(int j=0; i<s.length()&& j<numRows; j++) re[j] += s.charAt(i++);
			for(int j=gap; i<s.length()&& j>0; j--) re[j] += s.charAt(i++);
		}
		
		String result = "";
		for(int k=0; k<re.length;k++){
			result += re[k];
		}
    return result;
		
	}
}

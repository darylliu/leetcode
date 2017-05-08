package com.leetcode.problem.six;

/**
 * Reverse Words in a String III
 * @author ln
 *
 */
public class Problem557 {
	public String reverseWords(String s) {
    String[] ss = s.split(" ");
    String res = "";
    for(String sss: ss){
        res += " " + reverseString(sss);
    }
    return res.substring(1, res.length());
	}
	
	public String reverseString(String s){
	    char[] charArray = s.toCharArray();
	    int i = 0, j = charArray.length-1;
	    while(i <= j){
	        char tmp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = tmp;
	        i++;
	        j--;
	    }
	    return new String(charArray);
	}
}

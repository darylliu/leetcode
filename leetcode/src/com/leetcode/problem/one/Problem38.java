package com.leetcode.problem.one;

/**
 * Count and Say
 * @author ln
 *
 */
public class Problem38 {
	public String countAndSay(int n) {
		if(n==1) return "1";
		String last = countAndSay(n-1);
		String result = "";
		int count = 1;
		char orgin = last.charAt(0);
		for(int i=1; i<last.length(); i++){
			
			if(last.charAt(i-1) == last.charAt(i)){
				count++;
				orgin = last.charAt(i);
			}
			else{
				result = result +  count + orgin;
				count = 1;
				orgin = last.charAt(i);
			}
		}
		if(count != 0){
			result = result + count + orgin;
		}
		return result;
	}
}

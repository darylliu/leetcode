package com.leetcode.problem.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Letter Combinations of a Phone Number
 * @author ln
 *
 */
public class Problem17 {
	public List<String> letterCombinations(String digits) {
		List<String> re = new LinkedList<String>();
		if(digits.length()==0) return re;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		re.add("");
		for(int i=0; i<digits.length(); i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(re.size()!=0 && re.get(0).length()==i){
				String last = re.remove(0);
				for(char s: mapping[x].toCharArray())
					re.add(last + s);
			}
		}
		return re;
	}
}

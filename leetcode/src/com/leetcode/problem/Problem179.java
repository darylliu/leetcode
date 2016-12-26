package com.leetcode.problem;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Largest Number
 * @author ln
 *
 */
public class Problem179 {
	public String largestNumber(int[] nums) {
		String[] s = new String[nums.length];
		for(int i=0;i<nums.length;i++){
			s[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(s, new cp());
		String re = "";
		for(int i=0;i<s.length;i++){
			re = re.concat(s[i]);
		}
		
		int i = 0;  
    while (i < s.length && re.charAt(i) == '0') {  
        i++;  
    }  
    if (i == s.length) return "0";
    return re;
  }
	
	class cp implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			String a = o1.concat(o2);
			String b = o2.concat(o1);
			int i=0;  
      while(i<a.length()) {  
          if(a.charAt(i)!=b.charAt(i)) {  
              return a.charAt(i) - b.charAt(i);  
          }  
          ++i;  
      }  
      return 0;  
		}
		
	}
}

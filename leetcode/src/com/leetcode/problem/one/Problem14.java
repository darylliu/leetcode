package com.leetcode.problem.one;

/**
 * Longest Common Prefix
 * @author ln
 *
 */
public class Problem14 {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String shortest = strs[0];
		for(int i=0;i<strs.length;i++){
			if(strs[i].length()<shortest.length())
				shortest = strs[i];
		}
		if (shortest.length()==0)return "";
		System.out.println(shortest);
		int end =0;
		for(int i=0;i<shortest.length();i++){
			int j=0;
			for(j=0;j<strs.length;j++){
				if(strs[j].charAt(i)!=shortest.charAt(i))
					break;
			}
			if(j!=strs.length){
				end = i-1;
				break;
			}
			else end = i;
		}
		
		    return shortest.substring(0,end+1);
		}
}

package com.leetcode.problem;
/**
 * Reverse Vowels of a String
 * @author ln
 *
 */
public class Problem345 {
	
	public String reverseVowels(String s) {
		char[] sarray = s.toCharArray();
    int i = 0;
    int j = s.length()-1;
    while(i<j){
    	while(i<j){
    		if(sarray[i]=='U' || sarray[i]=='O' ||sarray[i]=='I' ||sarray[i]=='E' ||sarray[i]=='A' ||sarray[i]=='u' ||sarray[i]=='o' ||sarray[i]=='i' ||sarray[i]=='e' ||sarray[i]=='a' ){
    			break;
    		}
    		i++;
    	}
    	while(i<j){
    		if(sarray[j]=='U' || sarray[j]=='O' ||sarray[j]=='I' ||sarray[j]=='E' ||sarray[j]=='A' ||sarray[j]=='u' ||sarray[j]=='o' ||sarray[j]=='i' ||sarray[j]=='e' ||sarray[j]=='a' ){
    			break;
    		}
    		j--;
    	}
    	if(i==j) break;
    	char tmp = sarray[i];
    	sarray[i] = sarray[j];
    	sarray[j] = tmp;
    	i++;
    	j--;
    }
    
    return new String(sarray);
    
	}

}

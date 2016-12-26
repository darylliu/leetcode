package com.leetcode.problem;

import java.util.Stack;

/**
 * Valid Parentheses
 * @author ln
 *
 */
public class Problem20 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack();
    for(int i=0; i<s.length();i++){
    	char tmp = s.charAt(i);
    	switch (tmp){
    		case ']': {
    			char p = (char) stack.pop();
    			if (p!='[') return false;
    			else break;
    		}
    		case ')': {
    			char p = (char) stack.pop();
    			if (p!='(') return false;
    			else break;
    		}
    		case '}': {
    			char p = (char) stack.pop();
    			if (p!='{') return false;
    			else break;
    		}
    		default :{
    			stack.push(tmp);
    		}
    	}
    		
    }
    System.out.println(stack);
    if(stack.isEmpty()) return true;
    else return false;
    
    
  }
}

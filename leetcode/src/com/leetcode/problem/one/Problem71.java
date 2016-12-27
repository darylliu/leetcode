package com.leetcode.problem.one;

import java.util.Stack;

/**
 * Simplify Path
 * @author ln
 *
 */
public class Problem71 {
	public String simplifyPath(String path) {
    if (path.length() == 0 || path.length() == 1) return path;
    String[] array = path.substring(1, path.length()-1).split("/");
    if (path.charAt(path.length()-1) != '/') array = path.substring(1, path.length()).split("/");
    Stack s = new Stack();
    for(int i=0; i<array.length;i++){
        if(array[i].equals(".") || array[i].length()==0) continue;
        else if(array[i].equals("..") && !s.isEmpty()) s.pop();
        else if(array[i].equals("..") && s.isEmpty()) continue;
        else s.push(array[i]);
    }
    String result = "";
    while(!s.isEmpty()){
        result = "/"+s.pop()+result;
    }
    if(result.length()==0) return "/";
    return result;
    
 }
}

package com.leetcode.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Leetcode {
	public int closest = Integer.MAX_VALUE;
	public static ArrayList<Integer> res = new ArrayList<Integer>();
	public static void main(String[] args) {
		
	}
	
	
	
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
	
	public boolean isUgly(int num) {
    if (num == 1) return true;
    if (num < 1) return false;
    while(num != 1 ){
    	while(num%2==0) num = num/2;
    	while(num%3==0) num = num/3;
    	while(num%5==0) num = num/5;
    	if(num != 1) return false;
    }
    return true;
  }
	
	public boolean isHappy(int n) {
		if(n < 1) return false;
		if(n == 1) return true;
    HashSet<Integer> numbers = new HashSet<Integer>();
    while(true){
    	int s = 0;
    	while(n > 0){
    		s += (n%10) * (n%10);
    		n = n/10;
    	}
    	if(s==1) return true;
    	else if(numbers.contains(s)) return false;
    	numbers.add(s);
    	n = s;
    	
    }
  }
	
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
	
	public int titleToNumber(String s) {
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for(int i=0; i<26; i++){
    	map.put((char) ('A'+i), i+1);
    }
    int result = 0;
    for(int i=s.length()-1; i>=0; i--){
    	int tmp = map.get(s.charAt(i));
    	result = (int) (result + tmp* Math.pow(26, s.length()-1-i));
    }
    return result;
  }
	
	public char findTheDifference(String s, String t) {
    char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(t1);
    for(int i=0;i<s.length(); i++){
    	if(s1[i]!=t1[i]) return t1[i];
    }
    return t1[t1.length-1];
  }
	
	public int maxProfit(int[] prices) {
    int max = 0;
    int tmp = 0;
    for(int i=1;i<prices.length; i++){
        tmp = prices[i] - prices[i-1];
        if(tmp>0) max = max+tmp;
        
    }
    return max;
	}
	public boolean isPalindrome(String s) {
		if(s.length()==0) return true;
    s = s.toLowerCase();
    String s1 = "";
    String s2 = "";
    
    for(int i=0; i<s.length(); i++){
    	if(s.charAt(i)>=97 && s.charAt(i)<=122){
    		s1 += s.charAt(i);
    	}
    }
    
    for(int i=s.length()-1; i>=0; i--){
    	if(s.charAt(i)>=97 && s.charAt(i)<=122){
    		s2 += s.charAt(i);
    	}
    }
    if(s1.equals(s2)) return true;
    else return false;
  }
	
	public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> s = new HashSet<Integer>();
    for(int i=0;i<nums.length; i++){
        if(!s.add(nums[i])) return true;
    }
    System.out.println(s);
    return false;

    
	}
	public int rob(int[] nums) {
    int a = 0;
    int b = 0;
    for(int i=0;i<nums.length;i++){
    	int tmp = a;
    	a = Math.max(a, b);
    	b = tmp + nums[i];
    }
    
    return Math.max(a, b);
    
	}
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
    return re.substring(i);
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
	
	public String simplifyPath(String path) {
		if (path.length() == 0 || path.length() == 1) return path;
		path = path.replaceAll("//", "/");
    String[] array = path.substring(1, path.length()-1).split("/");
    if (path.charAt(path.length()-1) != '/') array = path.substring(1, path.length()).split("/");
    System.out.println(Arrays.toString(array));
    Stack s = new Stack();
    for(int i=0; i<array.length;i++){
        if(array[i].equals(".")) continue;
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
	
	public boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length-1;
    int n = matrix[0].length-1;
    int i=0;
    int j=m; 
    while(i<j){
        int k = (i+j)/2;
        
        if (target < matrix[k][0]) j = k-1;
        else if (target > matrix[k][0]) {
        	i = k+1;
        	if(target < matrix[i][0]){
        		i--;
        		break;
        	}
        }
        else return true;
    }
    System.out.println(i);
    int x=0;
    int y=n;
    while(x<y){
        int k = (x+y)/2;
        if (target < matrix[i][k]) y = k-1;
        else if (target > matrix[i][k]) x = k+1;
        else return true;
    }
    
    if(matrix[i][x]==target) return true;
    else return false;
    
	}
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int[][] array = Arrays.copyOf(obstacleGrid, obstacleGrid.length);
    
    for(int i=0; i<array.length; i++){
      for (int j=0; j<array[0].length; j++){
          if (array[i][j] == 1 ) array[i][j] = -1;
      }
    	}
    if(array[0][0]==-1) return 0;
    array[0][0] = 1;
    
    for(int i=0; i<array.length; i++){
        for (int j=0; j<array[0].length; j++){
        		if(array[i][j] == -1) continue;
        		if (i==0 && j==0) continue;
        		else if(i == 0 && j!=0 ) {
        			if(array[i][j-1] != -1) 
        				array[i][j] = array[i][j-1];
        		}
            else if(i != 0 && j == 0 ) {
            	if(array[i-1][j] != -1) 
            		array[i][j] = array[i-1][j];
            }
            else {
            	if(array[i][j-1] != -1) 
        				array[i][j] += array[i][j-1];
            	if(array[i-1][j] != -1) 
            		array[i][j] += array[i-1][j];
            }
        }
        
    }

    return array[array.length-1][array[0].length-1];
}
	public int uniquePaths(int m, int n) {
    int[][] array = new int[m][n];
    for(int i=0; i<m; i++){
        for (int j=0; j<n; j++){
            array[i][j] = 0;
        }
    }
    array[0][0] = 1;
    
    for(int i=0; i<m; i++){
        for (int j=0; j<n; j++){
        		if (i==0 && j==0) continue;
        		else if(i == 0 && j!=0 ) array[i][j] = array[i][j-1];
            else if(i != 0 && j == 0 ) array[i][j] = array[i-1][j];
            else array[i][j] = array[i-1][j] + array[i][j-1];
        }
    }
//    System.out.println(Arrays.toString(array));
    
    return array[m-1][n-1];
 }
	
	public boolean canJump(int[] nums) {
    int i = 0;
    while(i<=nums.length){
        int next = nums[i];
        if(next != 0){
            i+=next;
        }
        else if(i!=nums.length) return false;
    }
    return true;
    
	}
	
	public int climbStairs(int n) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    int i=1;
    while(i<=n){
      if(i==1) list.add(1);
      else if(i==2) list.add(2);
      else{
      	list.add(list.get(i-2)+list.get(i-3));
      }
      i++;
    }
    return list.get(list.size()-1);
  }
	
	public boolean isAnagram(String s, String t) {
		if(s==null||t==null||s.length()!=t.length()){  
      return false;  
		} 
		
    char[] array1 = s.toCharArray();
    char[] array2 = t.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);
    return Arrays.equals(array1, array2);
  }
	
	public int maxSubArray(int[] nums) {
    int biggist = Integer.MIN_VALUE;
    int tmpSum = 0;
    boolean ispos= false;
    int max = Integer.MIN_VALUE;
    
    for(int i=0; i<nums.length; i++){
    	if(nums[i]>=0) ispos = true;
    	tmpSum += nums[i];
    	if(tmpSum >= biggist) biggist = tmpSum;
    	if(tmpSum < 0 ) tmpSum =0;
    	if(nums[i]< 0 && nums[i]>=max) max = nums[i];
    }
    if(ispos)
    	return biggist;
    else return max;
  }
	
	public int singleNumber(int[] nums) {
		HashSet<Integer> cache = new HashSet<Integer>();
		for(int i=0; i<nums.length;i++){
			if(!cache.contains(nums[i])) cache.add(nums[i]);
			else cache.remove(nums[i]);
		}
		return (int)cache.iterator().next();
  }
	
	public int majorityElement(int[] nums) {
		int biggist = nums[0];
		int count = 1;
		HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length;i++){
			if(!cache.containsKey(nums[i])) cache.put(nums[i], 1);
			else {
				cache.put(nums[i], cache.get(nums[i])+1);
				if (cache.get(nums[i])>count) {
					count = cache.get(nums[i]);
					biggist = nums[i];
				}
			}
		}
		return biggist;
		
	}
	
	public String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
		
  }
	
	public void moveZeroes(int[] nums) {
		int i=0, j=0;
		while(j< nums.length){
			if(nums[i] != 0){
				i++;
				j++;
			}
			else if(nums[i] == 0 && nums[j] == 0)
				j++;
			else if(nums[i] == 0 && nums[j] != 0){
				nums[i] = nums[j];
				nums[j] = 0;
				i++;
				j++;
			}
		}
		
		for(int k = 0; k<nums.length;k++){
			System.out.println(nums[k]);

		}
    
  }
	
	public String countAndSay(int n) {
    if (n==1) return "1";
    String orgin = countAndSay(n-1);
    String result = "";
    int count = 0;
    char number = orgin.charAt(0);
    for(int i=0; i<orgin.length(); i++){
        if(i==0){
            count++;
            number = orgin.charAt(i);
        }
        if(i+1<orgin.length()){
        	if(orgin.charAt(i)==orgin.charAt(i+1)){
        		count++;
            number = orgin.charAt(i);
        	}
        	else{
        		result = result+count+number;
        		count = 1;
        		number = orgin.charAt(i+1);
        	}
            
        }
        else{
        		result = result+count+number;
            count=0;
        }
    }
    return result;
	}
	
	public int searchInsert(int[] nums, int target) {
    int i=0;
    int j=nums.length-1;
    while(i<=j){
    	int medium = (i+j)/2;
    	if(target==nums[medium]) return medium;
    	else if(target<nums[medium]) j = medium-1;
    	else i = medium+1;
    }
    return i;
}
	
	public int removeDuplicates(int[] nums) {
    if(nums.length < 2) return nums.length;
    int len = nums.length;
    for(int i=1;i<nums.length;i++){
        if(nums[i-1] == nums[i]) len--;
    }
    return len;
	}
	
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
	
	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
    HashMap<Character, String> dic = new HashMap<Character, String>();
    dic.put('2', "abc");
    dic.put('3', "def");
    dic.put('4', "ghi");
    dic.put('5', "jkl");
    dic.put('6', "mno");
    dic.put('7', "pqrs");
    dic.put('8', "tuv");
    dic.put('9', "wxyz");
    
    for(int i=0; i<digits.length();i++){
    	if(!dic.containsKey(digits.charAt(i)))
    		return new ArrayList<String>();
    	else{
    		String dig = dic.get(digits.charAt(i));
    		if(i==0){
    			for(int j=0;j<dig.length();j++) res.add(dig.charAt(j)+"");
    		}
    		else{
    			int oldLength = res.size();
    			for(int k=0;k<oldLength;k++) {
    				for(int m=0;m<dig.length();m++){
    					res.add(res.get(k)+dig.charAt(m));
    				}
    			}
    			System.out.println(res);
    			
    			res = res.subList(oldLength, res.size());
    		}
    	}
    }
    return res;
  }
	
	public int threeSumClosest(int[] nums, int target) {
		int gap = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for(int i =0;i<nums.length-2; i++){
    	if(i>0 && nums[i] == nums[i-1]) continue;
    	gap = findSumClosest(nums, i+1, nums.length-1, i, gap, target);
    }
    return this.closest;
    
  }
	
	public int findSumClosest(int[] nums, int start, int end, int target, int gap, int targetNumber){
		while(start<end){
			if(nums[start]+nums[end]+nums[target]>targetNumber){
				if(Math.abs(nums[start]+nums[end]+nums[target]-targetNumber) < gap){
					gap = Math.abs(nums[start]+nums[end]+nums[target]-targetNumber);
					this.closest = nums[start]+nums[end]+nums[target];
				}
				end--;
			}
			else if(nums[start]+nums[end]+nums[target]<targetNumber){
				
				if(Math.abs(nums[start]+nums[end]+nums[target]-targetNumber) < gap){
					gap = Math.abs(nums[start]+nums[end]+nums[target]-targetNumber);
					this.closest = nums[start]+nums[end]+nums[target];
				}
				start++;
			}
			else{
				this.closest = targetNumber;
				return 0;
				
			}
		}
		return gap;
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length<3 ) return res;
		
    Arrays.sort(nums);
    
    for(int i =0;i<nums.length-2; i++){
    	if(i>0 && nums[i] == nums[i-1]) continue;
    	res = findSum(nums, i+1, nums.length-1, i, res);
    }
    return res;
    
  }
	
	public List<List<Integer>> findSum(int[] nums, int start, int end, int target, List<List<Integer>> res){
		while(start<end){
			if(nums[start]+nums[end]+nums[target]>0){
				end--;
			}
			else if(nums[start]+nums[end]+nums[target]<0){
				start++;
			}
			else{
				List<Integer> tmp = new ArrayList<Integer>();
				tmp.add(nums[target]);
				tmp.add(nums[start]);
				tmp.add(nums[end]);
				res.add(tmp);
				while(start<end && nums[start] == nums[start+1]) start++;
				while(start<end && nums[end] == nums[end-1]) end--;
				start++;
				end--;
				
			}
		}
		return res;
	}
	
	public String longestCommonPrefix(String[] strs) {
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
	
	public int reverse(int x) {
		String result = "";
    if(x<0){
    	result = "-";
    }
    char[] tmp = (Math.abs(x)+"").toCharArray();
  	for(int i=tmp.length-1;i>=0;i--) result += tmp[i];
  	return Integer.parseInt(result);
  }

	public String convert(String s, int numRows) {
		if (numRows==1) return s;
		String[] res = new String[numRows];
		for(int m=0;m<numRows;m++){
			res[m]="";
		}
		int gap = numRows -2;
		int i=0;
		int j=0;
		while(i<s.length()){
			for(j=0;i<s.length()&&j<numRows;j++) res[j] += s.charAt(i++);
			for(j=gap;i<s.length()&&j>0;j--) res[j] += s.charAt(i++);
			
		}
		String result = "";
		for(int k=0; k<res.length;k++){
			result += res[k];
		}
    return result;
  }
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int total = nums1.length + nums2.length;
    if (total%2!=0)
    	return findKth(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, total/2+1);
    else
    	return (findKth(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, total/2)+findKth(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, total/2+1))/2;
  }
	
	public double findKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k){
		if (end1-start1 > end2-start2)
			return findKth(nums2, start2, end2, nums1, start1, end1, k);
		if(k==1){
			if(start1>end1) return nums2[start2];
			else if(start2>end2) return nums1[start1];
			else return Math.min(nums1[start1], nums2[start2]);}
		if(end1-start1+1 == 0)
			return nums2[k-1];
		if(end2-start2+1 == 0)
			return nums1[k-1];
		int i = Math.min(end1-start1+1, (k+1)/2);
		int j = k-i;
		if(nums1[start1 + i-1] < nums2[start2+j-1])
			return findKth(nums1, start1 + i, end1, nums2, start2, end2, k-i);
		else if(nums1[start1 + i-1] > nums2[start2+j-1])
			return findKth(nums1, start1, end1, nums2, start2+j, end2, i);
		else return nums1[start1 + i-1];
	}
	
	public String longestPalindrome(String s) {
		String str = "#";
		
		for(int i=0; i<s.length();i++){
			str += s.charAt(i) + "#";
		}
		int start = 0;
		int MaxLength = 0;
		int[] RL = new int[str.length()];
		int MaxRight = 0;
		int pos = 0;
		for(int j=0; j<str.length();j++){
			
			if (j<=MaxRight){
				RL[j] = RL[pos-j+pos];
				if (RL[j]+j>MaxRight){
					RL[j] = MaxRight-j;
				}
				int m = j-RL[j];
				int n = RL[j]+j;
				while(m>=0 && n<str.length() && str.charAt(m)==str.charAt(n)){
					RL[j]++;
					m--;
					n++;
				}
				
			}
			else{
				int m = j;
				int n = j;
				RL[j] = 0;
				while(m>=0 && n<str.length() && str.charAt(m)==str.charAt(n)){
					RL[j]++;
					m--;
					n++;
				}
			}
			if (MaxRight < j+RL[j]-1){
				MaxRight = j+RL[j]-1;
				pos = j;
			}
			if (MaxLength<RL[j]) {
				MaxLength = RL[j];
				start = j;
			}
			
			
		}
		
		String result = str.substring(start-MaxLength+1, start+MaxLength).replace("#", "");
		
		System.out.println(result);
		
		
    return str;
  }
}

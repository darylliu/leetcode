package com.leetcode.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int i=0;
	public static Integer l = new Integer(5);
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){  
	    public void run(){  
	        System.out.println("t1   "+i++);  
	    }  
		});  
		 
		Thread t2 = new Thread(new Runnable(){  
	    public void run(){  
	        System.out.println("t2   "+i--);  
	    }  
		});  
		t1.start(); 
		t2.start();  
	}
	public static void p3(int index){
		System.out.println(i--);
	}
	
	public static void p2(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int[] numA = new int[n];
    for(int i=0; i<n; i++){
          numA[i] = in.nextInt();
    }
    int[] numB = new int[n];
    for(int i=0; i<n; i++){
          numB[i] = in.nextInt();
    }
    int[] numx = new int[q];
    int[] numy = new int[q];
    for(int i=0; i<q; i++){
      numx[i] = in.nextInt();
      numy[i] = in.nextInt();
    }
    
    
    
    int[] res = new int[q];
    for(int i=0; i<q; i++){
    	for(int j=0;j<n;j++){
    		if(numx[i]<=numA[j]&&numy[i]<=numB[j]){
    			res[i]++;
    		}
    	}
    }
    
    for(int item: res){
    	System.out.println(item);
    }
	}
	
	public static void p1(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    
    int[] nums = new int[n];
    for(int i=0; i<n; i++){
          nums[i] = in.nextInt();
    }
    
    int start = 0, end = 0;
    int maxStart = 0, maxEnd = 0;
    for(int i=1 ;i<n-1; i++){
          if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
          	for(int j=i; j>0&& nums[j]>nums[j-1]; j--) start=j;
          	for(int j=i; j<n-1&& nums[j]>nums[j+1]; j++) end=j;
          	if((end-start)>(maxEnd-maxStart)){
          		maxEnd = end;
          		maxStart = start;
          	}
          }
    }
    maxStart--;
    maxEnd++;
    System.out.print(maxStart+ " " +maxEnd);
	}
}

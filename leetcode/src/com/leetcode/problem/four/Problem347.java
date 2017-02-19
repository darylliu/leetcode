package com.leetcode.problem.four;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Top K Frequent Elements
 * @author ln
 *
 */
public class Problem347 {
//	public List<Integer> topKFrequent(int[] nums, int k) {
//    List<Integer>[] bucket = new ArrayList[nums.length+1];
//    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
//    for(int num: nums){
//        m.put(num, m.getOrDefault(num, 0)+1);
//    }
//    for(int key: m.keySet()){
//        int value = m.get(key);
//        if(bucket[value] == null){
//            bucket[value] = new ArrayList<Integer>();
//        }
//        bucket[value].add(key);
//    }
//    List<Integer> res = new ArrayList<>();
//
//    for(int i=bucket.length-1; i>=0&& res.size()<k; i--){
//        if(bucket[i] != null) res.addAll(bucket[i]);
//    }
//    
//    return res;
//	}
}

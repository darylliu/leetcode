package com.leetcode.problem;

/**
 * Unique Paths
 * @author ln
 *
 */
public class Problem62 {
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
    
    return array[m-1][n-1];
  }
}

package com.leetcode.problem;

import java.util.Arrays;

/**
 * Unique Paths II
 * @author ln
 *
 */
public class Problem63 {
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
}

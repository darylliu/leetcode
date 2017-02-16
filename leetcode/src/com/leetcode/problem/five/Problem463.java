package com.leetcode.problem.five;

/**
 * Island Perimeter
 * @author ln
 *
 */
public class Problem463 {
	public int islandPerimeter(int[][] grid) {
    int islands = 0, neighbors = 0;
    for(int i=0; i<grid.length; i++){
        for(int j=0; j<grid[0].length; j++){
            if(grid[i][j] == 1){
                islands++;
                if(j+1<grid[0].length && grid[i][j+1] == 1) neighbors++;
                if(i+1<grid.length && grid[i+1][j] == 1) neighbors++;
            }
        }
    }
    return islands*4 - neighbors*2;
	}
}

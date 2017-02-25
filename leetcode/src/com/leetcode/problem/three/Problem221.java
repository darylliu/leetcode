package com.leetcode.problem.three;

/**
 * Maximal Square
 * @author ln
 *
 */
public class Problem221 {
	public int maximalSquare(char[][] matrix) {
    if(matrix.length==0) return 0;
    int maxSquare = 0;
    int[][] dp= new int[matrix.length][matrix[0].length]; 
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(i==0 || j==0) {
                dp[i][j] = matrix[i][j] - '0';
                if(dp[i][j]*dp[i][j] > maxSquare) maxSquare = dp[i][j]*dp[i][j];
                continue;
            }
            
            if((matrix[i][j] - '0') == 1) {
                dp[i][j]  = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) + 1;
                if(dp[i][j]*dp[i][j] > maxSquare) maxSquare = dp[i][j]*dp[i][j];
            }
            else{
                dp[i][j] = 0;
            }
        }
    }
    
    return maxSquare;
	}
}

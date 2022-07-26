package com.company;

public class Main {
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] dp = new int[m][n];

            traverse(grid, dp);

            return dp[m - 1][n - 1];
        }

        public void traverse(int[][] grid, int[][] dp){
            for(int i = 0; i < dp.length; i++){
                for(int j = 0; j < dp[i].length; j++){
                    dp[i][j] += grid[i][j];
                    if(i > 0 && j > 0){
                        dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
                    }
                    else if(i > 0){
                        dp[i][j] += dp[i - 1][j];
                    }
                    else if(j > 0){
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }
    }
}

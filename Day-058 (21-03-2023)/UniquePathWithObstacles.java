class Solution {
    public int dfs(int[][] grid, int[][] dp, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 1) 
            return 0;
        
        if(row == grid.length-1 && col == grid[0].length-1) 
            return 1;

        if(dp[row][col] > -1)
            return dp[row][col];
        dp[row][col] = dfs(grid, dp, row, col+1) + dfs(grid, dp, row+1, col);

        return dp[row][col];
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];

        for(int[] i: dp)
            Arrays.fill(i, -1);

        return dfs(grid, dp, 0, 0);
    }
}

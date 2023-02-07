class Solution {
    public void countBFS(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';
        countBFS(grid, i-1, j);
        countBFS(grid, i, j-1);
        countBFS(grid, i+1, j);
        countBFS(grid, i, j+1);
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == '1') {
                    count = count + 1;
                    countBFS(grid, i, j);
                }
            }
        }
        return count;
    }
}

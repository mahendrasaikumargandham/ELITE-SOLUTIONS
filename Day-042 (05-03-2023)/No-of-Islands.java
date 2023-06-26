class Pair {
    int row;
    int col;
    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    private void bfs(int r, int c, boolean[][] visited, char[][] grid) {
        visited[r][c] = true;
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(r, c));
        
        while(!queue.isEmpty()) {
            int ro = queue.peek().row;
            int co = queue.peek().col;
            
            queue.poll();
            
            for(int delRow=-1;delRow<=1;delRow++) {
                for(int delCol=-1;delCol<=1;delCol++) {
                    int currentRow = ro + delRow;
                    int currentCol = co + delCol;
                    
                    if(currentRow >=0 && currentRow < n && currentCol >= 0 && currentCol < m && grid[currentRow][currentCol] == '1' && visited[currentRow][currentCol] == false) {
                        visited[currentRow][currentCol] = true;
                        queue.offer(new Pair(currentRow, currentCol));
                    }
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int counter = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(visited[i][j] == false && grid[i][j] == '1') {
                    bfs(i, j, visited, grid);
                    counter++;
                }
            }
        }
        
        return counter;
    }
}

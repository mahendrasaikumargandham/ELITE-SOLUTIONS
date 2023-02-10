class Solution {
    class Pair {
        int row;
        int col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0)
            return 0;
        int freshOrange = 0;

        Queue<Pair> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 2)
                    queue.offer(new Pair(i, j));
                if(grid[i][j] == 1)
                    freshOrange++;
            }
        }
        if(freshOrange == 0)
            return 0;
        int count = -1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] a = {0, 0, 1, -1};
            int[] b = {1, -1, 0, 0};
            for(int i=1;i<=size;i++) {
                Pair node = queue.poll();
                for(int x=0;x<4;x++) {
                    int newR = node.row + a[x];
                    int newC = node.col + b[x];

                    if(newR < 0 || newR >= grid.length || newC < 0 || newC >= grid[0].length || grid[newR][newC] == 0)
                        continue;
                    
                    if(grid[newR][newC] == 1) {
                        grid[newR][newC] = 2;
                        queue.offer(new Pair(newR, newC));
                    }
                }
            }
           count++; 
        }
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1)
                    return -1;
            }
        }
        return count;
    }
}

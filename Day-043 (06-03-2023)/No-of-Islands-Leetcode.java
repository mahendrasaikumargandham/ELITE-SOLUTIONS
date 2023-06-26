class Solution {
    class Pair {
        int row;
        int col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public void countBFS(char[][] arr, int i, int j) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(i, j));
        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] a = {0, 0, 1, -1};
            int[] b = {1, -1, 0, 0};
            for(int x = 1;x<=size;x++) {
                Pair node = queue.poll();
                for(int k=0;k<4;k++) {
                int newR = node.row + a[k];
                int newC = node.col + b[k];

                if(newR < 0 || newR >= arr.length || newC < 0 || newC >= arr[0].length || arr[newR][newC] == '0')
                    continue;
                if(arr[newR][newC] == '1') {
                    arr[newR][newC] = '0';
                    queue.offer(new Pair(newR, newC));
                }

            }
            }
        }
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

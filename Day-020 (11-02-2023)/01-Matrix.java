class Solution {
    class Pair {
        int row;
        int col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public void bfs(int[][] mat, Queue<Pair> queue) {
        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] a = {0, 0, 1, -1};
            int[] b = {1, -1, 0, 0};
            for(int i=1;i<=size;i++) {
                Pair node = queue.poll();
                for(int x=0;x<4;x++) {
                    int newR = node.row + a[x];
                    int newC = node.col + b[x];

                    if(newR < 0 || newR >= mat.length || newC < 0 || newC >= mat[0].length || mat[newR][newC] != -1)
                        continue;
                    
                    mat[newR][newC] = mat[node.row][node.col] + 1;
                    queue.offer(new Pair(newR, newC));
                }
            }
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                if(mat[i][j] == 0)
                    queue.offer(new Pair(i, j));
                else 
                    mat[i][j] = -1;
            }
        }
        Solution instance = new Solution();
        instance.bfs(mat, queue);

        return mat;
    }
}

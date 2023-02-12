class Solution {
    public void bfs(int[][] isConnected, boolean[] visited, int i) {
        for(int j=0;j<isConnected[i].length;j++) {
            if(isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                bfs(isConnected, visited, j);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        Solution instance = new Solution();
        for(int i=0;i<isConnected.length;i++) {
            if(!visited[i]) {
                count = count + 1;
                instance.bfs(isConnected, visited, i);
            }
        }
        return count;
    }
}

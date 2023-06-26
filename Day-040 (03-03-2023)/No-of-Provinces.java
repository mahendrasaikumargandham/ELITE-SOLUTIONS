class Solution {
    public static void dfs(int node, boolean[] visited, int[][] isConnected) {
        for(int j=0;j<isConnected[0].length;j++) {
            if(isConnected[node][j] == 1 && visited[j] == false) {
                visited[j] = true;
                dfs(j, visited, isConnected);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int counter = 0;

        for(int i=0;i<visited.length;i++) {
            if(visited[i] == false) {
                counter++;
                dfs(i, visited, isConnected);
            }
        }

        return counter;
    }
}

class Solution {
    public void dfs(int src, boolean[] visited, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> adj) {
        visited[src] = true;
        arr.add(src);
        
        for(int neighbor: adj.get(src)) {
            if(!visited[neighbor]) {
                dfs(neighbor, visited, arr, adj);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[V];
        
        Solution instance = new Solution();
        instance.dfs(0, visited, arr, adj);
        return arr;
    }
}

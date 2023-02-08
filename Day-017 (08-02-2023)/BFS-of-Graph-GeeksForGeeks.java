class Solution {
    public void bfs(int src, ArrayList<Integer> arr, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        visited[src] = true;
        arr.add(src);
        queue.offer(src);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=1;i<=size;i++) {
                int node = queue.poll();
                for(int neighbor: adj.get(node)) {
                    if(!visited[neighbor]) {
                        queue.offer(neighbor);
                        visited[neighbor] = true;
                        arr.add(neighbor);
                    }
                }
            }
        }
    }
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Solution instance = new Solution();
        instance.bfs(0, arr, visited, adj);
        
        return arr;
    }
}

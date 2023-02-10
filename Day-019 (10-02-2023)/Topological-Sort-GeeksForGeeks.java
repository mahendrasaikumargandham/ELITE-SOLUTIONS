class Solution
{
    public void dfs(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack) {
        visited[src] = true;
        for(int neighbor: adj.get(src)) {
            if(!visited[neighbor]) {
                dfs(neighbor, visited, adj, stack);
                stack.push(neighbor);
            }
        }
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        Solution instance = new Solution();
        for(int i=0;i<V;i++) {
            if(!visited[i]) {
                instance.dfs(i, visited, adj, stack);
                stack.push(i);
            }
        }
        int[] arr = new int[stack.size()];
        for(int i=0;i<arr.length;i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}

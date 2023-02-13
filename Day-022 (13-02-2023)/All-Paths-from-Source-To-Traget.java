class Solution {
    public void dfs(int src, List<Integer> current, int graph[][], int dest, List<List<Integer>> arr){
        if(src == dest){
            arr.add(new ArrayList(current));
            return;
        }
        for(int n : graph[src]){
            current.add(n);
            dfs(n,current,graph,dest,arr);
            current.remove(current.size()-1);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> arr = new LinkedList();
        List<Integer> current = new ArrayList();
        current.add(0);
        Solution instance = new Solution();
        instance.dfs(0,current,graph,graph.length-1,arr);
        return arr; 
    }
}

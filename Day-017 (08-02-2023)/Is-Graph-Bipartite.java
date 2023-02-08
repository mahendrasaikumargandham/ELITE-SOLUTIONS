class Solution {
    public boolean checkColor(int[][] graph, int[] color, int c, int node) {
        if(color[node] != 0)
            return color[node] == c;
        
        color[node] = c;
        for(int neighbor: graph[node]) {
            if(!checkColor(graph, color, -c, neighbor))
                return false;
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];

        for(int i=0;i<color.length;i++) {
            if(color[i] == 0 && !checkColor(graph, color, 1, i))
                return false;
        }
        return true;
    }
}

import java.util.*;
import java.io.*;

class Graph {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public Graph(int vertices) {
        adjList = new ArrayList<>();
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void dfs(int src, List<Integer> arr) {
        visited[src] = true;
        arr.add(src);
        for (int neighbor : adjList.get(src)) {
            if (!visited[neighbor])
                dfs(neighbor, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int ver = sc.nextInt();
        int edg = sc.nextInt();
        Graph g = new Graph(ver);
        visited = new boolean[ver];
        for (int i = 0; i < edg; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        g.dfs(0, arr);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }
}

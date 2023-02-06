import java.util.*;
import java.util.LinkedList;
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

    void bfs(int src, List<Integer> arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        visited[src] = true;
        arr.add(src);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 1; i <= size; i++) {
                int node = queue.poll();
                for (int neighbor : adjList.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        arr.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
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
        g.bfs(0, arr);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }
}

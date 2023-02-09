import java.io.*;
import java.util.*;

public class Solution {
    static class Pair {
        int row;
        int col;
        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    public void bfs(int[][] arr, int i, int j) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(i, j));
        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] a = {0, 0, 1, -1, 1, -1, 1, -1};
            int[] b = {1, -1, 0, 0, 1, -1, -1, 1};
            for(int k=1;k<=size;k++) {
                Pair node = queue.poll();
                for(int x = 0;x<8;x++) {
                    int newR = node.row + a[x];
                    int newC = node.col + b[x];
                    if(newR<0 || newR>=arr.length || newC<0 || newC>=arr[0].length || arr[newR][newC] == 0) 
                        continue;
                    
                    if(arr[newR][newC] == 1) {
                        arr[newR][newC] = 0;
                        queue.offer(new Pair(newR, newC));
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution instance = new Solution();
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j] == 1) {
                    count = count + 1;
                    instance.bfs(arr, i, j);
                }
            }
        }
        System.out.println(count);
    }
}

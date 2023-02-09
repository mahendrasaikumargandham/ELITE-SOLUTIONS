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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Pair> queue = new LinkedList<>();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();   
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j] == 2)
                    queue.offer(new Pair(i, j));
            }
        }
        int time = -1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] a = {0, 1, 0, -1};
            int[] b = {1, 0, -1, 0};
            for(int i=0;i<size;i++) {
                Pair node = queue.poll();
                
                for(int k=0;k<4;k++) {
                    int newR = node.row + a[k];
                    int newC = node.col + b[k];
                    
                    if(newR < 0 || newR >= arr.length || newC < 0 || newC >= arr[0].length || arr[newR][newC] == 0)
                        continue;
                    
                    if(arr[newR][newC] == 1) {
                        arr[newR][newC] = 2;
                        queue.offer(new Pair(newR, newC));
                    }
                }
            }
            time++;
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j] == 1) {
                    time = -1;
                }
            }
        }
        System.out.println(time);
    }
}

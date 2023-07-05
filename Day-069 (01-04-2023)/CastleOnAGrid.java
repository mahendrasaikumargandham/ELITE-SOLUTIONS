import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Cell {
    int row;
    int col;
    int distance;
    
    public Cell(int row, int col, int distance) {
        this.row = row;
        this.col = col;
        this.distance = distance;
    }
}

class Result {

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid
     *  2. INTEGER startX
     *  3. INTEGER startY
     *  4. INTEGER goalX
     *  5. INTEGER goalY
     */
    
    private static boolean isValid(int newRow, int rows, int newCol, int cols) {
        if(newRow < rows && newRow >=0 && newCol < cols && newCol >= 0)
            return true;
        
        return false;
    }
    
    public static int minimumMoves(List<String> list, int startRow, int startCol, int goalRow, int goalCol) {
        char[][] grid = new char[list.size()][list.size()];
    
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                grid[i][j] = list.get(i).charAt(j);
            }
        }

        int rows = grid.length;
        int cols = grid[0].length;
        
        if(grid[startRow][startCol] == 'X' || grid[goalRow][goalCol] == 'X')
            return -1;
    
        boolean[][] visited = new boolean[rows][cols];
        visited[startRow][startCol] = true;
        
        Queue<Cell> queue = new LinkedList<>();
        
        queue.offer(new Cell(startRow, startCol, 0));
        
        while(!queue.isEmpty()) {
            Cell current = queue.poll();
            
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, 1, -1};
            
            if(current.row == goalRow && current.col == goalCol)
                return current.distance;
            
            for(int i=0;i<4;i++) {
                int newRow = current.row + dx[i];
                int newCol = current.col + dy[i];
                
                while(isValid(newRow, rows, newCol, cols) && grid[newRow][newCol] != 'X') {
                    if(!visited[newRow][newCol]) {
                        queue.offer(new Cell(newRow, newCol, current.distance + 1));
                        visited[newRow][newCol] = true;
                    }
                    
                    newRow += dx[i];
                    newCol += dy[i];
                }
            }
        }
        
        return -1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String gridItem = bufferedReader.readLine();
            grid.add(gridItem);
        }

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int startX = Integer.parseInt(firstMultipleInput[0]);

        int startY = Integer.parseInt(firstMultipleInput[1]);

        int goalX = Integer.parseInt(firstMultipleInput[2]);

        int goalY = Integer.parseInt(firstMultipleInput[3]);

        int result = Result.minimumMoves(grid, startX, startY, goalX, goalY);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

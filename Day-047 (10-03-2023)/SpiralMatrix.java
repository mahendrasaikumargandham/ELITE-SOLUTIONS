import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int n, int m) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;

        List<Integer> arr = new ArrayList<>();

        while(top <= bottom && left <= right) {
            for(int i=left;i<=right;i++) 
                arr.add(matrix[top][i]);
            top++;

            for(int i=top;i<=bottom;i++) 
                arr.add(matrix[i][right]);
            right--;

            if(top <= bottom) {
                for(int i=right;i>=left;i--)
                    arr.add(matrix[bottom][i]);
                bottom--;
            }

            if(left <= right) {
                for(int i=bottom;i>=top;i--)
                    arr.add(matrix[i][left]);
                left++;
            }
        }
        return arr;
    }
}

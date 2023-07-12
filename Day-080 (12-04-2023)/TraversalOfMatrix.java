import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] matrix = new int[row][col];
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                int ele = sc.nextInt();
                matrix[i][j] = ele;
                // System.out.print(arr[i][j] + " ");
            }
        }
        
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
        
        for(Integer integer: arr) 
            System.out.print(integer + " ");
    }
}

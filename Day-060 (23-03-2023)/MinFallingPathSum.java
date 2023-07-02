class Solution {
    private int func(int[][] matrix, int i, int j) {
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length) 
            return Integer.MAX_VALUE;
        return matrix[i][j];
    }
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=matrix.length-2;i>=0;i--) {
            for(int j=0;j<matrix[i].length;j++) {
                int bottom = func(matrix, i+1, j);
                int bottom_left = func(matrix, i+1, j-1);
                int bottom_right = func(matrix, i+1, j+1);

                matrix[i][j] = matrix[i][j] + Math.min(bottom, Math.min(bottom_left, bottom_right));
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<row;i++) 
            min = Math.min(min, matrix[0][i]);

        return min;
    }
}

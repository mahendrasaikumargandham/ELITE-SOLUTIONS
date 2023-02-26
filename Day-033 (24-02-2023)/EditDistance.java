class Solution {
    public int minDistance(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int m = ch1.length;
        int n = ch2.length;
        int[][] matrix = new int[m+1][n+1];

        for(int i=0;i<=n;i++) {
            matrix[0][i] = i;
        }

        for(int i=1;i<=m;i++) {
            matrix[i][0] = i;
            
            for(int j=1;j<=n;j++) {
                if(ch1[i-1] == ch2[j-1]) {
                    matrix[i][j] = matrix[i-1][j-1];
                }
                else {
                    int insert = matrix[i-1][j];
                    int delete = matrix[i][j-1];
                    int replace = matrix[i-1][j-1];
                    matrix[i][j] = Math.min(replace, Math.min(insert, delete)) + 1;
                }
            } 
        }
        return matrix[m][n];
    }
}
